package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {
	public static void main(String[] args) {

		// Variable declaration
		int givenNumber = -40;
		int positiveNumber;

		// Check the given number is negative or not
		if (givenNumber < 0) {
			positiveNumber = givenNumber * (-1);
			System.out.println("Given number : " + givenNumber);
			System.out.println("Positive number is: " + positiveNumber);
		}
	}
}