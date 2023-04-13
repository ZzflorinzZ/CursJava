package homeworkCurs7;

import java.util.Arrays;

/*
 * Scriem un program care ii cere userului 10 numere. 
 * Va pune acele numere intr-un array si va calcula suma lor.
 * La final va printa suma numerelor
 * 
 */

import java.util.Scanner;

public class ZeceNumere {

	public static void main(String[] args) {
		
		int[] inputNumbers = new int[10];
		int suma = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti 10 numere");

		
		for(int i=0; i<inputNumbers.length; i++) {
			inputNumbers[i] = scan.nextInt();
			suma = suma + inputNumbers[i];
		}
		
		
	//	System.out.println(Arrays.toString(inputNumbers));
		
		System.out.println("Suma numerelor din array este: " + suma); 
	}

}
