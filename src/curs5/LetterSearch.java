package curs5;

import java.util.Scanner;

/*
 * cerem un string de la tastatura
 * cautam in stringul respectiv daca contine litera A
 * daca o gasim, printam: "Litera A exista in text"
 * daca nu o gasim, printam "Litera A nu exista in text"
 * si mai printam si de cate ori apare
 * 
 */


public class LetterSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text");
		String text = scan.next();
		
		//System.out.println(text.length());
		//masina ==> masina.lenght()
		//012345
		
		int counter = 0;
		
		for (int i=0; i<text.length(); i++) {
			
			if (text.charAt(i) == 'A') {
				counter++;
			}
		}
		
		String result = counter>0 ? "Litera A exista in text de " + counter : "Litera A nu exista in text";
		System.out.println(result);
	}

}
