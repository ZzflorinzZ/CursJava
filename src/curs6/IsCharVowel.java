package curs6;

import java.util.Scanner;

public class IsCharVowel {

	public static void main(String[] args) {

		System.out.println("Introdu o litera");
		Scanner scan = new Scanner(System.in);
		char litera = scan.next().charAt(0);

		switch (litera) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Is vowel");
			break;
		default:
			System.out.println("Is not vowel");
		}

	}

}
