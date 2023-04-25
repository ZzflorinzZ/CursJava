package curs11;

public class TestInterface {

	public static void main(String[] args) {


	//	Angajat angajat = new Angajat();
		
		Tester tester = new Tester();
		tester.setName("Oana");
		tester.setEmail("oana@oana.com");
		
		System.out.println("Nume tester: " + tester.getName());
		System.out.println("Nume tester: " + tester.getEmail());
		
		tester.printNumeDepartament();
		
		
		Developer dev = new Developer();
		dev.setName("Ioana");
		dev.setEmail("ioana@ioana.com");
		
		System.out.println("Nume tester: " + dev.getName());
		System.out.println("Nume tester: " + dev.getEmail());
		dev.printNumeDepartament();
	}

}
