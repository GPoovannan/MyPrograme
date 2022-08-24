package Week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String name = "PayPal India";

		char[] convert = name.toCharArray();

		Set<Character> charSet = new HashSet<Character>();

		Set<Character> dupCharSet = new HashSet<Character>();

		for (Character remove : convert) {

			if (!charSet.add(remove)) {
				dupCharSet.add(remove);
			}
		}
		System.out.println("Characters in the Set :" + charSet);
		System.out.println("Duplicates in the Set:" + dupCharSet);

		// Removing duplicates from first set : charSet
		for (Character duplicate : dupCharSet) {
			if (dupCharSet.contains(duplicate)) {
				charSet.remove(duplicate);

			}
			System.out.println("Set after removing Duplicates :" + charSet);
		}
		// Removing the Empty Space

		System.out.print("Set after removing Empty Space :");
		for (Character charSet3 : charSet) {
			if (charSet3 != ' ') {
				System.out.print(charSet3 + "  ");
			}
		}
	}

}
