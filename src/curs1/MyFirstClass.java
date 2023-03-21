package curs1;

// --one line comment
// MyFirstClass ==>CamelCase (UpperCamelCase) --Conventie pentru numele claselor
// metodaMeaJava ==> LowerCamelCase --> conventia pentru numele metodelor sau variabilelor
// pentru pachete folosim doar litere mici
// com.google.numeaplicatie.orice


// My_First_Class --> conventie python (sbake case)

/*
 * 1
 * 2
 * 3
 * 4
 * 5
 * multi line comment
 */

public class MyFirstClass {

	/*
	 * public 	= modificator de acces
	 * 			= se poate restrictiona accesul 
	 */
	
	String nume = "Oana"; //variabila de instanta (pt ca se afla in interiorul clasei direct)
	int age = 1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * public static void main = metoda
		 */
		
		MyFirstClass obj = new MyFirstClass(); //instantierea clasei
		
		String prenume = "Ion"; //variabila locala -- poate fi fi folosita doar in interiorul metodei
		
		System.out.println(prenume);
		System.out.println(obj.nume);
		System.out.println(obj.age);
		
		
		MyFirstClass obj2 = new MyFirstClass();
		
	}

}
