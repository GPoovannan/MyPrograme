package Week3.day1;

public interface Plan {

	/*
	 * This method build the bedrooms which is east facing in 140 sqf with T&b and
	 * wardrobe
	 * 
	 * @author poova
	 * 
	 * @parameters number
	 */

	public void buildBadRooms(int number);

	/*
	 * 
	 */
	public void buildBalcany();

	public void buildParking();

	
	
	// static final variables
	
	int totalSaft =1500;
	String name = " Own building ";
	String[] flats = {"F1","F2","S1","S2"};
	
}
