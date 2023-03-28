package curs3;

public class VariableScope {
	
	public String nume = "Oana"; //variabila de instanta
								// pt a putea fi folosita are nevoie de o instanta (un obiect al clasei)
								// variabila globala (poate fi folosita oriunde, dar nu in interiorul clasei

	
	/*
	 * 1. compileaza
	 * 2. le incarca in jvm
	 * 3. jvm cauta membrii statici (variabile sau metode care au definit in declaratia lor cuvantul static)
	 * ...
	 * ...
	 * 4. instantiaza obiecte
	 * 
	 */
	
	public static String culoare = "Alb";
	
	public static void main(String[] args) {

		VariableScope obj = new VariableScope();
		
		String prenume = "Ion";
		
		System.out.println(obj.nume);
		
		System.out.println(prenume);
		
		System.out.println(culoare);

	}
	
	public void printeazaSalut() {
		
		System.out.println("Salut" + nume);
	}

}
