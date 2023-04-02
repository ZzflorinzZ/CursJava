package homeworkCurs4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountFactura {

	public static void main(String[] args) {
		
		
	//varianta mai complexa
		
		String factura;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the invoice value");
		factura = scan.next();
		
		
		String finalValue = (Double.valueOf(factura) > 100) ? 
				String.valueOf(Double.valueOf(factura) - Double.valueOf(factura) * 10/100) : 
				(0 < Double.valueOf(factura) && Double.valueOf(factura) < 100) ? 
				String.valueOf(Double.valueOf(factura) - Double.valueOf(factura) * 5/100) : 
				"Please enter a positive value";
		System.out.printf("%.2f", Double.valueOf(finalValue));
		System.out.println();
		
		System.out.println("===============================================");


	//=====================================================================
		
		
	//varianta simpla - nu trateaza valori negative
		
		double factura2;
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the invoice value");
		factura2 = scan2.nextDouble();
		
		
		double finalValue2 = (factura2 > 100) ? factura2 - factura2 * 10/100 : factura2 - factura2 * 5/100;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(df.format(finalValue2));

		
		System.out.println("===============================================");
		
		
	//=====================================================================
		
		
		double number =  10.2134546878678;

		System.out.println("First print :" + number);

		System.out.printf("Second print :" + "%.2f", number);

		System.out.println();

		System.out.println("Third print :" +Math.round(number));

		DecimalFormat df1 = new DecimalFormat("0.0");      

		System.out.println("Fourth print :" + df1.format(number));

		DecimalFormat df2 = new DecimalFormat("0.000");      

		System.out.println("Fifth print :" + df2.format(number));
	
		
	}

}
