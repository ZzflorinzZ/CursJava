package curs6;

import java.util.Scanner;

/*
 * intreb userul un calificativ si printez in functie de raspuns:
 * A ==> Felicitari!
 * B ==> Destul de bine!
 * C ==> Suficient!
 * D ==> Insuficient!
 * 
 * Daca introduce alt calificativ, printam Calificativ invalid!
 * 
 */

public class SwitchExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un calificativ");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {		//nu mai valideaza celelalte conditii dupa ce conditia a fost gasita
											//dar executa printurile
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Calificativ invalid!");
		}	

	}

}
