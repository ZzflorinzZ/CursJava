package homeworkCurs6;

import java.util.Scanner;

public class AcordareBonusV2 {

		static int vechime;
		static int valoareVanzari;
		static int lunaVanzari;
		boolean valid;
		Scanner scan = new Scanner(System.in);

		public void inputUserVechime() {
			System.out.println("Introduceti vechimea dvs. in companie");
			vechime = scan.nextInt();
		}
		
		public void inputUserVanzari() { 
			System.out.println("Introduceti valoarea vanzarilor efectuate");
			valoareVanzari = scan.nextInt(); 
		}
			
		public void inputUserLuna() {
			System.out.println("Introduceti luna in care ati efectuat vanzarile");
			lunaVanzari = scan.nextInt(); 
		}

		public void valoareVanzariValidation() {
			valid = true;
			if (valoareVanzari < 0) {
				valid = false;
				System.out.println("Valoarea introdusa este invalida");
			}
		}
		
		public void lunaVanzariValidation() {
			valid = true;
			if(lunaVanzari <1 || lunaVanzari >12) {
				valid = false;
				System.out.println("Luna introdusa este invalida");
			}
		}
		
		
		public void vechime3Ani(int valoareVanzari, int lunaVanzari) {

			if ((valoareVanzari >= 0 && valoareVanzari <= 5000) && (lunaVanzari >= 1 && lunaVanzari <= 12)) {
				System.out.println("Felicitari! Ai primit un bonus in valoare de 600 Ron");
			}
			if ((valoareVanzari > 5000 && valoareVanzari <= 10000) && (lunaVanzari >= 1 && lunaVanzari <= 6)) {
				System.out.println("Felicitari! Ai primit un bonus in valoare de 800 Ron");
				} else if ((valoareVanzari > 5000 && valoareVanzari <= 10000) && (lunaVanzari >= 7 && lunaVanzari <= 11)) {
					System.out.println("Felicitari! Ai primit un bonus in valoare de 1000 Ron");
				} else if ((valoareVanzari > 5000 && valoareVanzari <= 10000) && lunaVanzari == 12) {
					System.out.println("Felicitari! Ai primit un bonus in valoare de 900 Ron. In decembrie se vand singure!");
			}
			if (valoareVanzari > 10000) { 
				System.out.println("Felicitari! Ai primit un bonus in valoare de 1200 Ron");
			}
		}

		public static void main(String[] args) {

			AcordareBonusV2 obj = new AcordareBonusV2();
			obj.inputUserVechime();
			
			do {
				obj.inputUserVanzari();
				obj.valoareVanzariValidation();
			}while (!obj.valid);
			
			do {
				obj.inputUserLuna();
				obj.lunaVanzariValidation();
			}while (!obj.valid);
			

			switch (vechime) {
			case 1:
				System.out.println("Felicitari! Ai primit un bonus in valoare de 100 Ron");
				break;
			case 2:
				System.out.println("Felicitari! Ai primit un bonus in valoare de 200 Ron");
				break;
			case 3:
				obj.vechime3Ani(valoareVanzari, lunaVanzari);				
				break;
			default:
				System.out.println("Ai primit deja prea multe bonusuri! Incearca sa vinzi si pentru alte companii! :D");
				;
			}
		}

	}


