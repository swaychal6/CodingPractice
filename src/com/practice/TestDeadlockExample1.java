package com.practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestDeadlockExample1 {
//	public static void main(String[] args) {
		 private static final Lock lock1 = new ReentrantLock();
		    private static final Lock lock2 = new ReentrantLock();

		    public static void main(String[] args) {
		        Thread thread1 = new Thread(() -> {
		            try {
		                if (acquireLocks(lock1, lock2, 500, TimeUnit.MILLISECONDS)) {
		                    try {
		                        System.out.println("Thread 1: Acquired lock1 and lock2");
		                        // Code that uses lock1 and lock2
		                    } finally {
		                        lock1.unlock();
		                        lock2.unlock();
		                    }
		                } else {
		                    System.out.println("Thread 1: Unable to acquire locks within the timeout");
		                }
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        });

		        Thread thread2 = new Thread(() -> {
		            try {
		                if (acquireLocks(lock2, lock1, 500, TimeUnit.MILLISECONDS)) {
		                    try {
		                        System.out.println("Thread 2: Acquired lock2 and lock1");
		                        // Code that uses lock2 and lock1
		                    } finally {
		                        lock2.unlock();
		                        lock1.unlock();
		                    }
		                } else {
		                    System.out.println("Thread 2: Unable to acquire locks within the timeout");
		                }
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        });

		        thread1.start();
		        thread2.start();
		    }

		    private static boolean acquireLocks(Lock firstLock, Lock secondLock, long timeout, TimeUnit unit)
		            throws InterruptedException {
		        long startTime = System.currentTimeMillis();
		        while (true) {
		            if (firstLock.tryLock(timeout, unit)) {
		                try {
		                    if (secondLock.tryLock(timeout, unit)) {
		                        return true;
		                    } else {
		                        // Unable to acquire second lock, release the first lock
		                        firstLock.unlock();
		                    }
		                } finally {
		                    // Ensure that the first lock is released if the second lock cannot be acquired
		                    if (System.currentTimeMillis() - startTime >= timeout) {
		                        // Timeout reached, break the loop
		                        break;
		                    }
		                }
		            }
		        }
		        return false;
		    }
		}