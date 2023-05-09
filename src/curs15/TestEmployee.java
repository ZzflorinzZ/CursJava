package curs15;

public class TestEmployee {

	public static void main(String[] args) {

		Developer developer = new Developer("Ion", 500);
		EmployeeUtils<Developer> dev = new EmployeeUtils<Developer>(developer);
		
		EmployeeUtils<Manager> manager = new EmployeeUtils<Manager>(new Manager("Oana", 1600)); //obiectul nu poate fi refolosit 

	//	EmployeeUtils<Tester> manager = new EmployeeUtils<Tester>(new Manager("Oana", 1600));
		
		System.out.println(dev.getSalary());
		System.out.println(manager.getSalary());
	}

}
