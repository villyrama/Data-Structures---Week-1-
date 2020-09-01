import java.util.Map;
import java.util.TreeMap;

public class Test12 {

	public static void main(String[] args) {
		Date d1 = new Date(9, 24, 2002); 
		Date d2 = new Date(9, 26, 2020);

		
		TreeMap<Date, String> syllabus = new TreeMap();
			syllabus.put(d1, "Java");
			syllabus.put(d2, "Python");
			
			for(Map.Entry<Date, String> topic : syllabus.entrySet()) {
				
				if (topic.getKey().month == 9 && topic.getKey().year == 2002) {
					System.out.println(topic.getValue());
			}
				
				else {
					System.out.println(topic.getValue() + " does not fall in September, 2002");
				}
		
		}

	}
}