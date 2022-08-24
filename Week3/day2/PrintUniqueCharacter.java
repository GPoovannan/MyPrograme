package Week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "babu";
		
		char[] nameChar = name.toCharArray();
		
		Set<Character> uniqeList = new HashSet<Character>();
		
		for(Character uniquelist1:nameChar) {
			
			if(!uniqeList.add(uniquelist1)) {
				uniqeList.remove(uniquelist1);
			}
			
		}

		System.out.println("Print unique char:" + uniqeList);
	}
}
