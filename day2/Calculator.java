package week1.day2;

public class Calculator {

	/*--  Create a class "Calculator" with below methods
	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
	(c) mul(double num1, double num2), it should return product of num1 * num2
	(d) divide(float num1, float num2), it should return division of num1 / num2
	
	-- Create another class as MyCalculator and call all the methods from Calculator and print the results
	*/
	public int add(int num1, int num2, int num3) {
		int sumOf = num1 + num2 + num3;
		return sumOf;
	}

	public int sup(int num1, int num2) {
		int subOf = num1 - num2;
		return subOf;
	}

	public double multi(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}

	public float divide(float num1, float num2) {
		float divide = num1 / num2;
		return divide;
	}

	public static void main(String[] args) {

		Calculator call = new Calculator();
		call.add(1, 2, 3);
		call.sup(5, 4);
		call.multi(543542323, 453667554);
		call.divide(12.5655f, 4.677f);

	}

}
