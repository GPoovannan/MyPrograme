package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {

	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (shoud match item in both arrays)
	 */
	public static void main(String[] args) {

		int num[] = { 3, 2, 11, 4, 6, 7 };
		int nam1[] = { 1, 2, 8, 4, 9, 7 };
		int i,j;
		List<Integer> resultList = new ArrayList<Integer>();

		for ( i = 0; i < num.length; i++) {
			Arrays.sort(num);
			System.out.println(num[i]);

			for ( j = 0; j < nam1.length; j++) {
				if (num[i] == nam1[j])
					resultList.add(num[i]);
					
			}
		}
		System.out.println("Matching value :" + resultList);


	}

}
