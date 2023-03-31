package curs4;

import java.util.Scanner;

public class ConditionalOperator {
	
	/*
	 * facem un program care citeste 2 nr de la tastatura si verifica:
	 * daca fiecare nr este pozitiv
	 * daca ambele numere sunt pozitive
	 * care dintre cele 2 nr este cel mai mic sau daca sunt egale
	 */
	

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		num2 = scan.nextInt();
		
		//verific daca primul nr este pozitiv
		
		if(num1 > 0) {
			System.out.println("Num1 is positive");
		}else {
			System.out.println("Num1 is negative");
		}
		//result = contidie ? val1 : val2
		String result = num1 > 0 ? "Num1 is positive" : "Num1 is negative";
		System.out.println(result);
		
		
		//verific daca al doilea nr este pozitiv
		if(num2 > 0) {
			System.out.println("Num1 is positive");
		}else {
			System.out.println("Num1 is negative");
		}
		//result = contidie ? val1 : val2
		result = num2 > 0 ? "Num2 is positive" : "Num2 is negative";
		System.out.println(result);
		
		
		//verific daca ambele sunt pozitive
		if(num1 > 0 && num2>0) {
			System.out.println("Numbers are positive");
		}else {
			System.out.println("Numbers are negative");
		}
		result = (num1 > 0 && num2>0) ? "Numbers are positive" : "Numbers are negative";
		System.out.println(result);
		
		
		//verificam care este mai mare (ar putea sa fie egala)
		if(num1 > num2) {
			System.out.println("Num1 is the greatest");
		}else if (num2 > num1) {
			System.out.println("Num2 is the greatest");
		}else {
			System.out.println("Numbers are equal");
		}
		
		result = (num1 > num2) ? "Num1 is the greatest" : (num2 > num1) ? "Num2 is the greatest" : "Numbers are equal";
		System.out.println(result);
		
		
	}

}
