package homeworkCurs6;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza un login.
 * Programul primeste input de la utilizator un user si o parola.
 * Are trei incercari de logare
 * Atata timp cat incearca de trei ori si credentialele sunt gresite programul va printa : 
 * “Maximum attempts reached. User blocked”
 * 
 * Pentru fiecare incercare gresita programul printeaza : “Login Error”
 * Daca credentialele sunt valide programmul printeaza : “Login Sucessful”
 * 
 * Note:
 * Userul este String si valoarea valida este: “TestUser”
 * Parola este int si valoarea valida este :1234
 * 
 */

public class Login {
	
	
	String validUsername = "TestUser";
	int validPassword = 1234;
	static int contor = 0;
	
	Scanner scan = new Scanner(System.in);
	
	boolean valid;

	public String inputUsername() {
		System.out.println("Please enter Username");
		String username = scan.next();
		return username;
	}	
	
	public int inputPassword() {	
		System.out.println("Please enter Parola");
		int password = scan.nextInt();
		return password;
	}
	
	public void credentialsValidation(String username, int password) {
		
		valid = true;
		
		if((!username.equals(validUsername)) || (password != validPassword)) {
			System.out.println("Login Error");
			valid = false;
			contor++;
		}else {
			System.out.println("Login Successful");
			valid = true;
			contor = 0;		//atata timp cat iese din loop la "Login Successful", nu prea conteaza resetarea contorului
		}
		if(contor >= 3) {
			System.out.println("Maximum attempts reached. User blocked");
		}
	}	
	

	public static void main(String[] args) {

		Login obj = new Login();

		do {
			obj.credentialsValidation(obj.inputUsername(),obj.inputPassword());
		}while (!obj.valid && contor < 3);
		
	}

}

/*
 * mi-a luat ceva sa ma prind ca am nevoie de 2 conditii cumulative in do-while
 * 
 * while (contor < 3) - nu era suficienta conditia; ramanea in loop si dupa "Login Successful"
 * a 2-a conditie tebuia sa fie <<cat timp este printat Login Error>>, dar nu imi dadeam seama cum sa o scriu
 * 
 * am infrant!! :))
 * 
 * 
 * daca foloses variavila contor in do-while, am acelasi mesaj de eroare ca la vechime din ex.1, pana o declar statica
 * 
 */









