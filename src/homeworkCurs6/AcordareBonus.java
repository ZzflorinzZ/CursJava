package homeworkCurs6;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza un program de acordat bonusuri.
 * Programul primeste input de la utilizator :
 * 		Anul de vechime in firma
 * 		Valoarea vanzarilor efectuate
 * 		Luna in care a efectuat vanzarile
 * 
 * Daca are un an vechime atunci primeste un bonus de 100
 * Daca are 2 ani vechime atunci primeste un bonus de 200
 * 
 * Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu 5000 atunci primeste bonus 600
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate 
 * in oricare din lunile 1-6 primeste bonus 800
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate 
 * in oricare din lunile 7-11 primeste bonus 1000
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate 
 * in luna 12 primeste bonus 900 si mesajul : “In decembrie se vand singure!”
 * Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste bonus 1200
 * 
 */

public class AcordareBonus {

	static int valoareVanzari;
	static int vechime;
	static int lunaVanzari;
	static Scanner scan = new Scanner(System.in);
	
	boolean valid;

	public void inputUserVechime() {
		System.out.println("Introduceti vechimea dvs. in companie");
		vechime = scan.nextInt();
	}
	
	public void inputUserVanzariSiLuna() {
		System.out.println("Introduceti valoarea vanzarilor efectuate");
		valoareVanzari = scan.nextInt();
		System.out.println("Introduceti luna in care ati efectuat vanzarile");
		lunaVanzari = scan.nextInt();
	}
	
	public void validareValoareVanzariSiLuna() {
		
		valid = true;
		
		if(valoareVanzari < 0) {
			valid = false;
            System.out.println("Te rog sa introduci o valoare valida pentru vanzari");
            valoareVanzari = scan.nextInt();
		}
		if(lunaVanzari < 1 || lunaVanzari > 12) {
			valid = false;
            System.out.println("Te rog sa introduci o luna valida");  
            lunaVanzari = scan.nextInt();
		}
	}

	public void vechime3Ani() {

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

		AcordareBonus obj = new AcordareBonus();
		obj.inputUserVechime();

		switch (vechime) {
		case 1:
			System.out.println("Felicitari! Ai primit un bonus in valoare de 100 Ron");
			break;
		case 2:
			System.out.println("Felicitari! Ai primit un bonus in valoare de 200 Ron");
			break;
		case 3:
			obj.inputUserVanzariSiLuna();
			
			do {
				obj.validareValoareVanzariSiLuna();
			}while (!obj.valid);
				
			obj.vechime3Ani();
			break;
		default:
			System.out.println("Ai primit deja prea multe bonusuri! Incearca sa vinzi si pentru alte companii! :D");
			;
		}
	}

}

/*
 * daca nu declaram vechime ca variabila statica, se pare ca nu putea fi utilizata in switch 
 * primeam mesaj Cannot make a static reference to the non-static field vechime 
 * nu inteleg de ce are nevoie in switch sa faca referitna neaparat catre o variabila statica 
 * vineri nu am definit variabile statice in exemplele de switch...
 * 
 * 
 * R: Problema nu este la switch ci in metoda main. Metoda main este un context static, switch-ul doar se intampla 
 * sa fie chemat in acel context si sa foloseasca variabila aceea. Dar nu switchul avea nevoie sa fie statica 
 * ci metoda main care executa (public static void main)
 * 
 */


