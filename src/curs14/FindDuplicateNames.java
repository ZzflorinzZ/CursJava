package curs14;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNames {

	public static void main(String[] args) {


		String[] myStringArray = {"Oana", "Maria", "Ion", "Maria", "Ion", "Maria", "Ion", "Bogdan"};

		for(int i = 0; i<myStringArray.length; i++) {
			for(int j = i+1; j<myStringArray.length; j++) {
				if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume ducplicat " + myStringArray[i]);
				}
			}
		}
		
		System.out.println("----------------------------");
		
		Set<String> duplicat = gasesteDuplicat(myStringArray);
		for(String nume : duplicat) {
			System.out.println("Nume duplicat " + nume);
		}
	}
	
	
	public static Set<String> gasesteDuplicat(String[] array){
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i].equals(array[j]));
				set.add(array[i]);
			}
		}
		return set;
	}

}
