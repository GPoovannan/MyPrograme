package Week3.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Land implements Plan{
	
	public void buildBadRooms(int number) {
		System.out.println(number + "badrooms :" + number);
		
	}
	public void buildBalcany() {
		System.out.println( " Balcany build success");
		
	}public void buildParking() {
		System.out.println( " Parking build success");
		
	}
	
	public void buildGuarden() {
		System.out.println( " Guarden build success");
		
	}
}
