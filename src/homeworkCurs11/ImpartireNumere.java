package homeworkCurs11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpartireNumere {
	
/*
	public static void askFirstNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number");
		int number1 = scan.nextInt();
	}

	public static void askSecondNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the second number");
		int number2 = scan.nextInt();
	}

*/
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		int nfeCount;
		int aeCount;
		int nbr1=0;
		int nbr2=0;

		try {

			do {
				aeCount = 0;
				try {
					do {
						nfeCount = 0;
						try {
//							askFirstNumber();
							System.out.println("Please insert the first number");
							int number1 = scan.nextInt();
							nbr1 = number1;
						} catch (NumberFormatException nfe) {
							System.out.println("Please use only numbers!");
							nfeCount++;
						}
					} while (nfeCount > 0);

					do {
						nfeCount = 0;
						try {
//							askSecondNumber();
							System.out.println("Please insert the second number");
							int number2 = scan.nextInt();
							nbr2 = number2;
						} catch (NumberFormatException nfe) {
							System.out.println("Please use only numbers!");
							nfeCount++;
						}
					} while (nfeCount > 0);

					System.out.println("Numbers division result is: " + nbr1 / nbr2);

				} catch (ArithmeticException ae) {
					System.out.println("Please don't use division by 0!");
					aeCount++;
				}
			} while (aeCount > 0);

		} catch (Exception e) {
			System.out.println("General error");
		}

	}
}
