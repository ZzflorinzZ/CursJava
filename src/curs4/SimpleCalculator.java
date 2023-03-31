package curs4;

import java.util.Scanner;

/*
 * facem un calculator simplu pt operatiile de baza: 
 * + (adunare)
 * - (scadere)
 * * (inmultire)
 * / (impartire)
 * 
 * intrebam userul primul nr
 * intrebam operatorul pe care vrea sa il foloseasca
 * intrebam nr 2
 * printam sub forma: ex: 2 + 2 = 4
 * 
 */


//masina = secventa de caractere pt Java
//java accesesza secventa de caractere pe baza unui index	==> 012345

//masina.charAt(0 == 'm')


public class SimpleCalculator {
	
	int num1, num2, result;
	char operator;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu primul numar: ");
		num1 = scan.nextInt();
		System.out.println("Te rog introdu operatorul: ");
		operator = scan.next().charAt(0);
		System.out.println("Te rog introdu al doilea numar: ");
		num2 = scan.nextInt();
		
	}
	
	public void calculateValues() {
		askTheUser();
		
		if(operator == '+') {
			result = num1+num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if(operator == '-') {
			result = num1-num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if(operator == '*' || operator == 'x') {
			result = num1*num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else if(operator == '/' || operator == ':') {
			result = num1/num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else {
			System.out.println("Te rog sa introduci doar: * / + -");
		}
	}	
}
