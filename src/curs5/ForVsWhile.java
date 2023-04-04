package curs5;

import java.util.Scanner;

/*
 * facem un program care ii cere utilizatorului numere pe care le aduna in continuu
 * userul introduce cate numere vrea (fara limita)
 * cand vrea sa se opreasca, introduce 0
 * 
 * FOR
 * WHILE 
 *
 */

public class ForVsWhile {

	public static void main(String[] args) {

		ForVsWhile obj = new ForVsWhile();
	//	obj.rezolvareCuFor();
	//	obj.rezolvareCuFor2();
		obj. rezolvareCuWhile();
		
	}
	
	public void rezolvareCuFor() {
		
		Scanner scan = new Scanner(System.in);
		int total = 0;
		
		for (;;) {
			System.out.println("Te rog sa introduci un numar: ");
			int numar = scan.nextInt();
			
			if (numar == 0) {
				break;
			}
			total = total + numar;
		}
		
		System.out.println(total);
	}
	
	
	public void rezolvareCuFor2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un numar: ");
		
		int total = 0;
		
		for (int numar = scan.nextInt(); numar != 0; numar=scan.nextInt()) {
			
			total = total + numar;
			System.out.println("Te rog sa introduci un numar: ");
		}
		
		System.out.println(total);
	}
	
	public void rezolvareCuWhile() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un numar: ");
		int numar = scan.nextInt();
		int total = 0;
		
		while (numar != 0) {
			total = total + numar;
			System.out.println("Te rog sa introduci un numar: ");
			numar = scan.nextInt();
		}
		
		System.out.println(total);
	}

}
