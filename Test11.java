public class Test11 {

	public static void main(String[] args) {
		Date d1 = new Date(8, 24, 2020); 
		Date d2 = new Date(9, 26, 2020);
	
	// prints later comparison
		if(d1.compareTo(d2) == 1) {
			System.out.println(d1 + " is later than " + d2);
			
		}
		
	// prints earlier comparison
		else if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is earlier than " + d2);
			
		}
		
	// prints if both are the same dates
		else {
			System.out.println(d1 + " and " + d2 + " are the same dates");
		}
	}

}