package homeworkCurs13;

import java.util.HashMap;
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
		 
		System.out.println(catalog.get("Florin"));

		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert your name");
		String name = scan.next();
		System.out.println("Please insert your grade");
		int grade = scan.nextInt();
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
	
		System.out.println(catalog.size());
	}

}
