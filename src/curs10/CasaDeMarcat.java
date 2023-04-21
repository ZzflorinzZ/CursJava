package curs10;

public class CasaDeMarcat {
	
	/*
	 * produse de tip dulciuri
	 * avem produse individuale
	 * pt fiecare produs avem obligatoriu pret de vanzare + TVA si nume
	 * stim ca unele produse se vand la bucata
	 * stim ca alte produse se vand la kg
	 * stim ca alte produse se vand la bax
	 * (Jeleuri (kg), Inghetata (buc) si Napolitane (bax))
	 * 
	 * scanam 3 produse si afisam nr de produse + pretul total al produselor
	 * 
	 */

	public static Produse[] array = new Produse[3];
	
	public static void pretTotal() {
		double sum = 0;

		for (Produse produs : array) {
			sum = sum + produs.pret();
		}
		System.out.println("Ai de platit:" + sum);
	}
	
	
	public static void main(String[] args) {

		Inghetata icecream = new Inghetata("Napoca", 4);
		Jeleuri ursuleti = new Jeleuri("Haribo", 20, 0.5);
		Napolitane joe = new Napolitane("Joe", 20, 15, 10);
		
		array[0] = icecream;
		array[1] = ursuleti;
		array[2] = joe;
		
		pretTotal();
	}

}
