package week1.day2;

public class Car {

	public void brandName() {
		System.out.println("Ford");
	}

	public String getColor() {
		return "Red";
	}

	public int carEngineNumber() {
		return 78456654;
	}

	public int twoNumberSub(int a, int b) {
		int c = a - b;
		return c;

	}

	public int twoNumberMulti(int s, int t) {
		int u = s * t;
		return u;
	}

	public int twoNumberDivi(int x, int y) {
		int z = x / y;
		return z;

	}

	public static void main(String[] args) {
		Car object = new Car();

		object.brandName();
		String getColor = object.getColor();
		System.out.println(getColor);
		int carEngineNumber = object.carEngineNumber();
		System.out.println(carEngineNumber);
		int twoNumberSub = object.twoNumberSub(6, 3);
		System.out.println(twoNumberSub);
		int twoNumberMulti = object.twoNumberMulti(4, 2);
		System.out.println(twoNumberMulti);
		int twoNumberDivi = object.twoNumberDivi(3, 3);
		System.out.println(twoNumberDivi);
	}
}