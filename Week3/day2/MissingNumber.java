package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] num = { 10, 2, 8, 5, 6, 7, 2, 9, 1 };

		Set<Integer> miss = new TreeSet<Integer>();

		for (int i = 0; i < num.length; i++) {

			miss.add(num[i]);

		}
		System.out.println("print the number: " + miss);
		
		for (int i = 0; i < miss.size(); i++) {
			if (!miss.contains(i + 1)) {
				System.out.println("The Missing Number:" + (i + 1));
			}
		}

	}

}
