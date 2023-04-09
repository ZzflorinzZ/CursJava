package homeworkCurs6;

import java.util.Scanner;

public class AcordareBonusV2 {

		static int vechime;
	//	int valoareVanzari;
	//	int lunaVanzari;
		boolean valid;
		Scanner scan = new Scanner(System.in);

		public void inputUserVechime() {
			System.out.println("Introduceti vechimea dvs. in companie");
			vechime = scan.nextInt();
		}
		
		public int inputUserVanzari() { 
			System.out.println("Introduceti valoarea vanzarilor efectuate");
			int valoareVanzari = scan.nextInt(); 
			return valoareVanzari;
		}
			
		public int inputUserLuna() {
			System.out.println("Introduceti luna in care ati efectuat vanzarile");
			int lunaVanzari = scan.nextInt();
			return lunaVanzari;  
		}

		public void valoareVanzariValidation(int valoareVanzari) {
			valid = true;
			if (valoareVanzari < 0) {
				valid = false;
				System.out.println("Introduceti o valoare valida");
			}
		}
		
		public void lunaVanzariValidation(int lunaVanzari) {
			valid = true;
			if(lunaVanzari <1 || lunaVanzari >12) {
				valid = false;
				System.out.println("Introduceti o luna valida");
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
				obj.valoareVanzariValidation(obj.inputUserVanzari());
			}while (!obj.valid);
			
			do {
				obj.lunaVanzariValidation(obj.inputUserLuna());
			}while (!obj.valid);
			

			switch (vechime) {
			case 1:
				System.out.println("Felicitari! Ai primit un bonus in valoare de 100 Ron");
				break;
			case 2:
				System.out.println("Felicitari! Ai primit un bonus in valoare de 200 Ron");
				break;
			case 3:
	//			obj.vechime3Ani();
/*
 * aici m-am blocat; nu stiu cum sa ii dau parametrii 
 * daca o scriu de forma
 * 		obj.vechime3Ani(obj.valoareVanzariValidation(obj.inputUserVanzari()),obj.lunaVanzariValidation(obj.inputUserLuna());)	
 * ma trece din nou prin scan si imi cere sa reintroduc valoarea vanzarilor si a lunii; 
 * 		practic validarile do-while au fost facute degeaba
 * iar daca introduc o valoare invalida	pe valoare vanzari, pare ca se amesteca codul - trece din nou prin do-while
 * dar si executea mai departe si cere luna
 * am doua print-uri simultane:
 * 		Introduceti o valoare valida
 * 		Introduceti luna in care ati efectuat vanzarile	
 */
				
				break;
			default:
				System.out.println("Ai primit deja prea multe bonusuri! Incearca sa vinzi si pentru alte companii! :D");
				;
			}
		}

	}


