package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	// get the length of the array
	// declare an int variable named count

	// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count

	// iterate from i to the length of the array by adding 1 to it (inner loop
	// starts here)

	// compare both the loop variables & check they're equal

	// increase the count if both the arrays are equal

	// Out of the inner loop, check and print the first array variable if count is
	// more than 0

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = arr.length;
		System.out.println("Arrar length : " + length);
		int count = 0;
		List<Integer> dublicatList = new ArrayList<Integer>();

		for (count = 0; count <= length - 1; count++) {
			for (int j = count + 1; j <= length - 1; j++) {
				if (arr[count] == arr[j]) {
					dublicatList.add(arr[j]);
				}

			}

		}

		System.out.println("Dublicate arry list: " + dublicatList);
	}
}