package curs9;

import javax.annotation.processing.SupportedSourceVersion;

public class MethodOverload {					//polimorfism static - se foloseste in aceeasi clasa, cu parametri diferiti
												//si pastram aaceeasi functionalitate a metodei
	public static void main(String[] args) {


		System.out.println("ABC");//String
		System.out.println(123);//int
		System.out.println('c');//char
		System.out.println(2.5);//double

		testParametru("Ceva");
		//testParametru(123);
		
		multiply(3.5, 4);
		
	}
	
	public static void testParametru(String text) {
		System.out.println(text);
		
	}
	
	public static void multiply(int num1, int num2) {
		System.out.println(num1*num2); 
	}
	public static void multiply(double num1, double num2) {
		System.out.println(num1*num2); 
	}

}
