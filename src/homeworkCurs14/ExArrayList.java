package homeworkCurs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExArrayList {

	public static void main(String[] args) {


		List<String> list1 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product3", "Product4", "Product5"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product6", "Product4", "Product8"));
		
		
		List<String> comparisonResult = new ArrayList<>();
		
		for (String element : list1) {
			if(list2.contains(element)) {
				comparisonResult.add("Yes");
			}else {
				comparisonResult.add("No");
			}
		}
		
		System.out.println(comparisonResult);
	}

}
