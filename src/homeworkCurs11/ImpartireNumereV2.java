package homeworkCurs11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpartireNumereV2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nfeCount;
		int aeCount;

		try {
			do {
				nfeCount = 0;
				aeCount = 0;
				try {
					System.out.println("Please insert 2 numbers");
					int number1 = scan.nextInt();
					int number2 = scan.nextInt();

					System.out.println("Numbers division result is: " + number1 / number2);

				} catch (NumberFormatException nfe) {
					System.out.println("Please use only numbers!");
					nfeCount++;
				} catch (ArithmeticException ae) {
					System.out.println("Please don't use division by 0!");
					aeCount++;
				}
			} while (nfeCount > 0 || aeCount > 0);
		} catch (Exception e) {
			System.out.println("General error");
		}
	}

}

//nu intra pe NumberFormatException cand introduc litere, se duce pe Exception
//daca schimb cu InputMismatchException intra in infinite loop; 
// nu te lasa sa reintroduci primul nr si sare direct in exceptie
