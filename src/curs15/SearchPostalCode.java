package curs15;

import java.util.Scanner;

public class SearchPostalCode {
	
	/*
	 * facem o aplicatie care primeste un cod postal de la tastatura si afiseaza
	 * orasul aferent acelui cod postal
	 * 
	 * daca codul nu exista arunc o exceptie CodPostalException
	 * daca codul exista, printez orasul aferent codului "Orasul asociat codului este + cod + Oras"
	 * in cazul exceptiei vreau sa intreb din nou pana primesc un cod valid
	 * 
	 * avem nevoie de un obiect care sa tina codurile si orasele inca de la initializare
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		CoduriPostale codPost = new CoduriPostale();
		
		while (true) {
		try {
			System.out.println("Introduceti codul postal");
			int codPostal = scan.nextInt();
			codPost.postalCodeSearch(codPostal);
			break;			
		}catch (CodPostalException e) {
			e.printStackTrace();
		}
		
		}
	}

}
