package homeworkCurs3;

import java.util.Scanner;

public class VarstaUtilizator {
	
	int  age;
	
	public void askTheAge() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
	}
	
	
	public void checkTheAge() {

		if (age < 18) {
			System.out.println("Esti minor");
		}else if (age >= 18 && age <= 65) {
			System.out.println("Esti adult");
		}else {
			System.out.println("Esti batran");
		}
		
	}

}
