package curs3;

public class StaticVsNonStatic {

	public static String nume;
	public static String departament = "QA";
	
	
	public static void main(String[] args) {

		System.out.println(nume);
		System.out.println(departament);
		System.out.println("--------------------------");
		
		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume = "Jhonny";
		System.out.println(person.nume + departament);
		
		System.out.println("--------------------------");
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Ioana";
		System.out.println(person2.nume + departament);
		
		System.out.println("--------------------------");
		departament = "DEV";
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person3.nume = "TREI";
		System.out.println(person3.nume + departament);
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println(person.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);
		
		
		//static se incarca inainte de crearea obiectului
		//valoarea unei variabile statice nu se asociaza cu obiectul
		//un obiect static nu este asociat cu instanta clasei respective ??
		
		
	}

}
