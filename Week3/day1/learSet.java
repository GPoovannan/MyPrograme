package Week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class learSet {

	public static void main(String[] args) {

		List<Integer> set = new ArrayList<Integer>();

		List<Integer> duplicateList = new ArrayList<Integer>();

		List<Integer> uniqueList = new ArrayList<Integer>();

		set.add(1);
		set.add(22);
		set.add(3);
		set.add(54);
		set.add(65);
		set.add(22);
		set.add(43);
		set.add(67);
		set.add(98);
		set.add(1);

		for (Integer number : set) {
			if (number.equals(1) || number.equals(22)) {
				if (!duplicateList.contains(number)) {
					duplicateList.add(number);
				}

			} else {

				uniqueList.add(number);

			}

		}

		System.out.println(duplicateList);
		System.out.println(uniqueList);

		/*
		 * Set<Integer> set1 = new LinkedHashSet<Integer>();
		 * 
		 * for (Integer uniqueValue : set1) { System.out.println(uniqueValue);
		 * 
		 * }
		 */
	}

}
