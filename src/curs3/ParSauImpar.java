package curs3;

import java.util.Scanner;

/*
 * program care verifica un nr daca este par sau impar
 * nr il citim de la tastatura
 * daca este par, atunci printam: "Nr este par"
 * daca nr este impar, atunci printam: "Nr este impar"
 * 
 */
public class ParSauImpar {
	
	public int number;
	
	public void askTheNumber() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}
	
	public void checkNumber() {
		
		// % - modulo - iti spune restul impartiirii la 2
		// == - operator de egalitate
		if (number % 2 == 0) {
			System.out.println("Nr este par");
		}else {
			System.out.println("Nr este impar");
		}
	}

}
