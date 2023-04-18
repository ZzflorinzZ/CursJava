package curs9.package1;

class DefaultAccessModifier {
	
	/*
	 * Default inseamna ca nu specificam niciun access modifier
	 * Scopul este limitat la pachetul in care se afla
	 * 
	 * Same class: yes
	 * SubClass in same package: yes
	 * Other class in same package:yes
	 * 
	 * SubClass in  other package: no
	 * other class in other package: no
	 * 
	 * 
	 */

	String mesaj = "Default modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	
	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();;
	}
	
}
