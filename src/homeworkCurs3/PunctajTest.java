package homeworkCurs3;

import java.util.Scanner;

public class PunctajTest {

	double punctaj;
	
	public void askTestGrade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		punctaj = scan.nextDouble();
	}
	
	public void checkTestGrade() {
		
		if (punctaj >= 0 && punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca");
		}else if (punctaj >= 66){
			System.out.println("Felicitari, Ai trecut!");
		}else {
			
		}
	}
}
