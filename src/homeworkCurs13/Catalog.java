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
	
		
		
/*
		for (String nameFromCatalog : catalog.keySet()) {
			for (int gradeFromCatalog : catalog.values()) {
				if (catalog.get(name.equalsIgnoreCase(nameFromCatalog)) == null) {
					catalog.put(name, grade);
					System.out.println("Nu aveai nota, ti-am trecut acum!");
				} else if (name.equalsIgnoreCase(nameFromCatalog) || grade < gradeFromCatalog) {
					System.out.println("Nu ai nevoie de alta nota");
				} else if (name.equalsIgnoreCase(nameFromCatalog) || grade > gradeFromCatalog) {
					catalog.replace(nameFromCatalog, grade);
				}

			}
		}
*/
		
/*		
		for (String nameFromCatalog : catalog.keySet()) {
			if (catalog.containsKey(name.equalsIgnoreCase(nameFromCatalog)) == false) {
				catalog.put(name, grade);
				System.out.println("Nu aveai nota, ti-am trecut acum!");
			} else if (catalog.containsKey(name.equalsIgnoreCase(nameFromCatalog)) == true){
				for (int gradeFromCatalog : catalog.values()) {
					if (grade < gradeFromCatalog) {
						System.out.println("Nu ai nevoie de alta nota");
					}else if (grade > gradeFromCatalog) {
						catalog.replace(nameFromCatalog, grade);
					}
				}
			}
		}
*/
		
		try {
			System.out.println("Please enter your name");
			String name = scan.next();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.println("Please enter your grade");
			int grade = scan.nextInt();
			
			System.out.println("Your current grade is: " + catalog.get(name));
			System.out.println("---------------------");
			
		if (catalog.containsKey(name) == false) {
			catalog.put(name, grade);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		} else if (catalog.containsKey(name) == true) {
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
		
		}catch (InputMismatchException ime) {
			System.out.println("Trebuie sa introduci nota fara zecimale. Ia-o de la capat");
			}
		
		
	}

}
