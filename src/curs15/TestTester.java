package curs15;

public class TestTester {

	public static void main(String[] args) {


		Tester t1 = new Tester(23);
		t1.printAge();
		
		Tester t2 = new Tester(23.00);
		t2.printAge();
		
		Tester t3 = new Tester("23");
		t3.printAge();

	}

}
