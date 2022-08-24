package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		Set<Integer> uniqeList = new HashSet<Integer>();

		Set<Integer> duplicateList = new HashSet<Integer>();

		for (int i = 0; i < data.length; i++) {

			if (uniqeList.add(data[i]) == false) {

				duplicateList.add(data[i]);
			}

		}
		System.out.println("Duplicate list: " + duplicateList);
	}

}
