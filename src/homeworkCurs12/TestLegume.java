package homeworkCurs12;

import java.util.Scanner;

public class TestLegume {

	public static void main(String[] args) {

		Legume obj = new Legume();
		obj.writeFisierLegume();

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Te rog introdu numele legumei pe care doresti sa o cumperi");
			String leguma = scan.next();
			leguma = leguma.toLowerCase();

			obj.readFisierLegume(leguma);

			if (obj.readFisierLegume(leguma) != null) {
				System.out.println("Leguma aleasa de tine are " + obj.readFisierLegume(leguma) + " calorii");
				break;
			}
	//		} else if (obj.calorii == null) {
				System.out.println("Nu vindem aceasta leguma");
//			}
		} while (true);
				
	
	}

}
