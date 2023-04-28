package homeworkCurs11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpartireNumereV2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int nfeCount=0;
//		int aeCount=0;

		
			do {
				try {
//				nfeCount = 0;
//				aeCount = 0;
				try {
					System.out.println("Please insert 2 numbers");
					int number1 = Integer.parseInt(scan.next());
					int number2 = Integer.parseInt(scan.next());
//number2 = (Integer) null;
					System.out.println("Numbers division result is: " + number1 / number2);
					break;

				} catch (NumberFormatException nfe) {
					System.out.println("Please use only numbers!");
	//				nfeCount++;
				} catch (ArithmeticException ae) {
					System.out.println("Please don't use division by 0!");
	//				aeCount++;
				}
				} catch (Exception e) {
					System.out.println("General error");
				}
	//		} while (nfeCount > 0 || aeCount > 0);
			}while (true);
			
		
	}

}

//nu intra pe NumberFormatException cand introduc litere, se duce pe Exception
//daca schimb cu InputMismatchException intra in infinite loop; 
// nu te lasa sa reintroduci primul nr si sare direct in exceptie
