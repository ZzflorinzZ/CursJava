package curs11;

public interface Angajat { 	//clasa interfata este o clasa abstracta care are toate metodele abstracte
							//metodele nu mai trebuie definite cu cuvantul abstract
							//interfetele nu se extind, se implementeaza
	
//	public static final String salariu = "100";
	
	public void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void testCeva();
	
	default void printNumeDepartament() { //default permite adaugarea unei metode cu implementare
		System.out.println("QA");
	}
	
}
