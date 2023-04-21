package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		
	//	Thread.sleep(5000);
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter num1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter num2: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			
			System.out.println("division: " + num1/num2);
		}catch(ArithmeticException e) {								//a impartit la 0
			System.out.println("Please do not divide by zero!");
		}catch(InputMismatchException e) {							//a introdus litra in loc de numar
			System.out.println("Please do only numeric!");
		}catch(NullPointerException e) {
			System.out.println("Null pointer has occured!");
		}catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		
		
		
		System.out.println("Code after exception!");

	}

}
