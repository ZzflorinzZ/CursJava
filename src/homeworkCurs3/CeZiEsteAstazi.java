package homeworkCurs3;

import java.util.Scanner;

public class CeZiEsteAstazi {

	int zi;
	
	public void askTheDayNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("A cata zi din saptamana este astazi?");
		zi = scan.nextInt();
	}
	
	public void checkTheDay() {
		
		if (zi == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0");
		}else if (zi == 1) {
			System.out.println("Astazi este Luni");
		}else if (zi == 2) {
			System.out.println("Astazi este Marti");
		}else if (zi == 3) {
			System.out.println("Astazi este Miercuri");
		}else if (zi == 4) {
			System.out.println("Astazi este Joi");
		}else if (zi == 5) {
			System.out.println("Astazi este Vineri");
		}else if (zi == 6) {
			System.out.println("Astazi este Sambata");
		}else if (zi == 7) {
			System.out.println("Astazi este Duminica");
		}else if (zi > 7){
			System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
		}else {
			
		}
		
	}
	
}