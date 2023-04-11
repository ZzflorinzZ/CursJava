package curs7;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachExample {

	public static void main(String[] args) {


		String[] orase = {"Iasi", "Cluj", "Brasov", "Timisoara"};
		
		String[] nume = new String[3];
		Scanner scan = new Scanner(System.in);
	//	System.out.println("Introdu nume: ");
	//	nume[0] = scan.next();
		
		for(int i = 0; i<=3; i++) {
			System.out.println("Introdu nume: ");
			nume[i] = scan.next();
		}
		
		System.out.println(Arrays.toString(nume));
	
		
		for(String element : nume) {
			System.out.println(element);
		}
		
		
	}

}
