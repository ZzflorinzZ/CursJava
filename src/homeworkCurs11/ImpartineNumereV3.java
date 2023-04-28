package homeworkCurs11;

import java.util.Scanner;

public class ImpartineNumereV3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;

		do {
			try {
				if (number1 == 0) {
					System.out.println("Please insert the first number");
					try {
						number1 = Integer.parseInt(scan.next());
					} catch (NumberFormatException nfe) {
						System.out.println("Please use only numbers!");
						continue;
					}
				}
				System.out.println("Please insert the second number");
				try {
					number2 = Integer.parseInt(scan.next());
				} catch (NumberFormatException nfe) {
					System.out.println("Please use only numbers!");
					continue;
				}
				if (number2 == 0) {
					throw new ArithmeticException("Please don't use division by 0!");
				}

				System.out.println("Numbers division result is: " + number1 / number2);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);

	}

}
