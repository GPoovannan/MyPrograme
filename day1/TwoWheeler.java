package week1.day1;

public class TwoWheeler {

	// global variable declaration
	int noOfWheeles = 2;
	short noOfMirrors = 2;
	long chassisNumber = 5637489438L;
	String bikeName = "Honda";
	double runningKm = 60.4567;
	boolean isPuntured = true;

	public static void main(String[] args) {

		// object creation
		TwoWheeler twoWheeler = new TwoWheeler();

		// Get the value from the object
		int numberOfWheels = twoWheeler.noOfWheeles;
		short numberOfMirrors = twoWheeler.noOfMirrors;
		long chassisNumber = twoWheeler.chassisNumber;
		String bikeName = twoWheeler.bikeName;
		double runningkm = twoWheeler.runningKm;
		boolean isPuntured = twoWheeler.isPuntured;

		// Print the value
		System.out.println("Number of wheels: " + numberOfWheels);
		System.out.println("Number of Mirrors: " + numberOfMirrors);
		System.out.println("Chass number is: " + chassisNumber);
		System.out.println("bike Name is: " + bikeName);
		System.out.println("Mileage bike: " + runningkm);
		System.out.println("bike puntured: " + isPuntured);
	}
}
