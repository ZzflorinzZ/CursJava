package curs9.package1;

public class ProtectedAccessModifier {
	
	/*
	 * Scopul lui protected este in acvelasi pachet si subclase din pachete diferite
	 * clasele nu pot fi declarate Protected
	 * 
	 * 
	 * Aceeasi clasa: yes
	 * Alta clasa in acelasi pachet: yes
	 * SubClasa in acelasi pachet: yes
	 * 
	 * SubClasa in alt pachet: yes
	 * Alta clasa in alt pachet: no
	 * 
	 */
	
	protected String mesaj = "Protected access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}

	public static void main(String[] args) {

		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
		

	}

}
