package week1.day2;

public class IsPrime {
	/*
	 * Assignment 4: Print if the given number is prime
	 * 
	 * Goal: To understand the problem solving, looping and conditional statement
	 * 
	 * a) Create a class by name: IsPrime b) Create a main method using shortcut c)
	 * Write a logic to find if the given number is prime or not d) Print if it is
	 * prime or not
	 * 
	 * Hint: Iterate through all numbers from 2 to n-1 (input) and for every number
	 * check if it divides n (input). If we find any number that divides, print
	 * prime. If nothing divides, then print non-prime
	 */
	public static void main(String[] args) {

		int a = 14;

		/*
		 * boolean flag = false; for (int i = 2; i <= a/2; ++i) { if (a % i == 0) { flag
		 * = true; break;
		 * 
		 * }
		 * 
		 * }
		 */

		int j = 2;
		boolean flag=false;
		while (j <= a / 2) {
			if (a % 2 == 0) {
				flag = true;
				break;
			}
			++j;
		}

		if (!flag)

			System.out.println(a + " Prime Number.");

		else
			System.out.println(a  + " NotPrime Number.");
		System.out.println("-------------------------");
	}

}
