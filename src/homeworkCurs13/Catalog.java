package homeworkCurs13;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {

		Map<String, Integer> catalog = new HashMap<>();
		
			catalog.put("Alina", 4); 
			catalog.put("Bogdan", 5); 
			catalog.put("Claudia", 6);
			catalog.put("Daniel", 7); 
			catalog.put("Elena", 8); 
			catalog.put("Florin", 9);
			catalog.put("George", 10); 

		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter your name");
		String name = "";
		int grade = 0;
		
		try {
			name = scan.next();
			System.out.println("Please enter your grade");
			grade = scan.nextInt();
		}catch (InputMismatchException ime) {
			System.out.println("Trebuie sa introduci nota fara zecimale. Ia-o de la capat");
			}
		
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
			
		if(catalog.get(name) == null) {
			System.out.println("You don't have a grade");
		}else {
			System.out.println("Your current grade is: " + catalog.get(name));
			System.out.println("---------------------");
		}
			
//		if (catalog.containsKey(name) == false) {
		if (!catalog.containsKey(name)) {	
			catalog.put(name, grade);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		} else if (catalog.containsKey(name)) {
				if (grade <= catalog.get(name)) {
					System.out.println("Nu ai nevoie de alta nota");
				}else if (grade > catalog.get(name)) {
					catalog.replace(name, grade);
				}
			}
		
		System.out.println("---------------------");
		System.out.println("Your final grade is: " + catalog.get(name));
		
		System.out.println("---------------------");
		System.out.println("Catalog size is now: " + catalog.size());
		System.out.println("---------------------");
		
		for(String namefromCatalog : catalog.keySet()) {			
			System.out.println(namefromCatalog + " - " + catalog.get(namefromCatalog));
		}		
		
	}

}
