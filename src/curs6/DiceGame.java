package curs6;

import java.util.Scanner;

/*
 * facem un joc de zaruri care are urmatoarele reguli:
 * 1. daca userul da in total: 2, 6 si 12 ==> pierde jocul
 * 2. daca userul da in total: 7, 11 ==> castiga jocul
 * 3. daca userul da in total: 3, 10 ==> automat se repeta aruncarea
 * 4. daca userul da oricare alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca o data
 *  Raspunsul va fi de data type boolean.
 *  daca zie True: mai da o data
 *  daca zice False: se termina jocul
 * 
 */

public class DiceGame {

	public static void main(String[] args) {

		boolean conditie = true;

		while (conditie) {
			int dice1 = (int) (Math.random() * 6 + 1); 	// genereaza un nr intre 0 si 0.9
														// multiplicat cu 6 ajungem pana la 5 si pulsam cu 1
			int dice2 = (int) (Math.random() * 6 + 1);
			int total = dice1 + dice2;

			if (total == 2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau! Ai dat: " + total + " " + "Ai pierdut!");
				break;
			} else if (total == 7 || total == 11) {
				System.out.println("Felicitari! Ai dat: " + total + " " + "Ai castigat!");
				break;
			} else if (total == 3 || total == 10) {
				System.out.println("Ai dat: " + total + " " + "Automat mai dai o data");
			} else {
				System.out.println("Ai dat: " + total + " " + "Vrei sa mai dai o data");
				Scanner scan = new Scanner(System.in);
				conditie = scan.nextBoolean();
				}
			}
		System.out.println("Game Over!");
		}

	}

