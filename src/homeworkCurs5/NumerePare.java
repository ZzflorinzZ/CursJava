package homeworkCurs5;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul 2 numere. 
 * Va printa doar numerele pare aflate intre acele 2 numere.
 * 
 */

public class NumerePare {

	public static void main(String[] args) {

		NumerePare obj = new NumerePare();
	//	obj.forSolution();
		obj.whileSolution();
		
	}	
		
		public void forSolution() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number");
		int numar1 = scan.nextInt();
		System.out.println("Please insert the second number");
		int numar2 = scan.nextInt();
		
		
		if (numar1 < numar2) {
			for (int i = numar1 + 1; i < numar2; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}else if (numar1 > numar2){
			for (int i = numar1 - 1; i > numar2; i--) {
				if (i % 2 == 0) {
					System.out.println(i);
				} 
			}
		}
		
	}
		
		public void whileSolution() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please insert the first number");
			int numar1 = scan.nextInt();
			System.out.println("Please insert the second number");
			int numar2 = scan.nextInt(); 
			
			
		while (numar1 + 1 < numar2) {
			numar1++;
			if (numar1 % 2 == 0) {
				System.out.println(numar1);
			}
		}	
			
		while (numar1 - 1 > numar2) {
			numar1--;
			if (numar1 % 2 == 0) {
				System.out.println(numar1);		
			}
		}
	}
}
