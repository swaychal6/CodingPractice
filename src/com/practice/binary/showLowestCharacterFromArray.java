package com.practice.binary;

public class showLowestCharacterFromArray {
public static void main(String[] args) {
	char[]  letters = {'c','f','j','k','m','n','p'};
			char target = 'g';
			
			char nextGreatestLetter = nextGreatestLetter(letters, target);
			
			System.out.println(nextGreatestLetter);
}
public static char nextGreatestLetter(char[] letters, char target) {
    int start=0;
    int end=letters.length-1;

    while(start<end){

        int mid=start+(end-start)/2;

        if(target > letters[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }

    return letters[start % letters.length];
}
}
