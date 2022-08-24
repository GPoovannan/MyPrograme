package Week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindingSecondLargestNumber {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		
		
		Set <Integer> set1 = new TreeSet<Integer>();
	
		for (int i = 0; i < 11; i++) {
			set1.add(data[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>(set1);
		
		System.out.println("ACCI order: " + (list));
		
		int lastIdx = list.size() - 2;
		int lastElement = list.get(lastIdx);
		//System.out.println("The last index of list is: " + lastIdx);
		System.out.print("The last element of list is: " + lastElement);
	
		
	}

}
