import java.util.ArrayList;

public class Integers {
	ArrayList <Integer > nums = new ArrayList();

	static int computeSum(ArrayList<Integer> something) {
		int sum = 0;
		for(int num : something) {
			sum+= num;
		}
		return sum;
	}
	
}