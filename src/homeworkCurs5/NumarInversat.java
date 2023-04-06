package homeworkCurs5;

import java.util.Scanner;

/*
 * Folosind WHILE scriem un program care cere un numar de la tastatura si il printeaza inversat. 
 * Ex : daca userul introduce 1234 , vom printa 4321
 * 
 */

public class NumarInversat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number of at least 2 digits");
		int numar = scan.nextInt();
		
		int restImpartireLaZece = 0;
		
		int numarInversat = 0;
		
	while (numar > 0) {
		restImpartireLaZece = numar % 10;
		numarInversat = numarInversat * 10 + restImpartireLaZece;
		numar = numar / 10;
		System.out.println(numar);
		
		}
	
		System.out.println(numarInversat);
	}

}
