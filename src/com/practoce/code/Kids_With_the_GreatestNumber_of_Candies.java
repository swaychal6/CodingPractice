package com.practoce.code;

import java.util.ArrayList;
import java.util.List;

//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
public class Kids_With_the_GreatestNumber_of_Candies {
	public static void main(String[] args) {
		int arr[] = {2,3,5,1,3};
		List<Boolean> kidsWithCandies = kidsWithCandies(arr, 3);
		System.out.println(kidsWithCandies);
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		int max = candies[0];
		for (int i = 0; i < candies.length; i++) {

			if (max < candies[i]) {
				max = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++) {
			int sum=candies[i]+extraCandies;
			if (sum >= max) {
				list.add(true);
			}else {
				list.add(false);
			}
			
			sum=0;
		}
		return list;

	}
}
