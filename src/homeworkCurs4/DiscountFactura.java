package homeworkCurs4;

import java.util.Scanner;

public class DiscountFactura {

	public static void main(String[] args) {
		
/*		
	//varianta mai complexa
		
		double factura;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the invoice value");
		factura = scan.nextDouble();
		
		
		double finalValue = (factura > 100) ? factura - factura * 10/100 : (0 < factura && factura < 100) ?
					factura - factura * 5/100 : "Please enter a positive value";
		System.out.println(finalValue);
		
		/*
		 * Cum se pot folosi data type-uri diferite intr-o variabila careia ii este alocat un Ternary operator?
		 * 
		 * daca definesc String factura si String finalValue ==> operatorii nu functioneaza pt data type String
		 * 
		 * daca definesc double factura si String finalValue ==> nu poate face conversia din double in String
		 * 
		 * daca definesc double factura si double finalValue si vreau sa printez si un String ==> nu poate face conversia din String in double
		 * 
		 */



	//varianta simpla - nu trateaza valori negative
		
		double factura2;
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the invoice value");
		factura2 = scan2.nextDouble();
		
		
		double finalValue2 = (factura2 > 100) ? factura2 - factura2 * 10/100 : factura2 - factura2 * 5/100;
		System.out.println(finalValue2);

		/*
		 * se poate limita numarul de zecimale folosit de double?
		 * 
		 * daca valoarea facturii introduse este cu 2 zecimale (ex. 44.6), face calculul cu pana la 15 zecimale 
		 * si as vrea sa returneze mereu rezultatul cu maxim 2 zecimale 
		 * 
		 */
		
		
	}

}
