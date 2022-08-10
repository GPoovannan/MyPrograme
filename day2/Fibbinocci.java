package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {

		int firstName = 0, secondName = 1, sum = 0;

		System.out.print(firstName + " " + secondName);

		for (int i = 2; i < 11; i++) {
			sum = firstName + secondName;
			System.out.print(" " + sum);
			firstName = secondName;
			secondName = sum;

		}
	}

}
