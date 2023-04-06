package homeworkCurs5;

import java.util.Scanner;

/*
 * Folosind un FOR scriem un program care verifica daca un cuvant este Palindrom.
 * Ex : radar (daca citim de la final , tot acelasi inteles are)
 * 
 */

public class Palindrom {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String cuvant = scan.next();
		
		String cuvantCititInvers = "";
		
		for (int i = cuvant.length() -1; i>=0; i--) {
			cuvantCititInvers = cuvantCititInvers + cuvant.charAt(i);
		}

		System.out.println(cuvantCititInvers);
		System.out.println("========================");
		String result = cuvantCititInvers.equals(cuvant) ? "Cuvantul este palindrom" : "Cuvantul nu este palindrom";
		System.out.println(result);
		
		
	}

	/*
	 * initial scrisesem 
	 * 
	 * 		a)	String cuvantCititInvers = null;
	 * 	
	 * a1) nu suprascrie cand primeste valoare daca variabila este initializata cu null?	
	 * 
	 * 
	 * 		b)	for (int i = cuvant.length(); i==0; --i) 
	 * 
	 * si nu functiona, dar nu sunt sigur ca inteleg de ce.
	 * 
	 * b1) int i = cuvant.length() este lungimea cuvantului 
	 * 			aici aveam eroare - String index out of range: 5
	 * 			daca ii scad 1 nu ar trebui sa inceapa sa-l citeasca de la penultima litera?
	 * 			lungimea nu este citita la fel ca indecsii, incepand cu 0?
	 * 
	 * b2) iar cand indeplineste conditia ca i==0, sa iasa din loop
	 * 			aici, cand i==0, nu scria nimic in variabila cuvantCititInvers
	 * 	  de ce este neaparat nevoie sa fie i>=0? 
	 * 	
	 * 
	 */
}


