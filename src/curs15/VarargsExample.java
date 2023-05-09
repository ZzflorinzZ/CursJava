package curs15;

public class VarargsExample {
	
	//varargs = lista de parametri poate sa difere
	//se pot da oricati parametri intr-o metoda, dar argumentele variabile trebuie sa fie tot timpul ultimele
	//poti sa ai doar un parametru de tip varargs

	public static void main(String[] args) {
		
		printCeva("A", "B", "C");
		printCeva("A");
		printCeva("A", "B", "C", "D", "E", "F");
		
		printCeva2(32, false, "A", "B", "C", "D", "E", "F");

	}
	
/*	
	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void printCeva(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
*/
	
	public static void printCeva(String...values) {	//... = lista argumente variabile (java le pune intr-un array)
		for(String value : values) {
			System.out.println(value);
		}
	}
	
	public static void printCeva2(int num, boolean flag, String...values) {
		for(String value : values) {
			System.out.println(value);
		}
	}
}
