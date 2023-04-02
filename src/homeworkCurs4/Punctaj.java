package homeworkCurs4;

import java.util.Scanner;

public class Punctaj {
	

	public static void main(String[] args) {
		
		int punctaj;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score");
		punctaj = scan.nextInt();

		String calificativ = (punctaj >= 90) ? "FB" : (punctaj >= 80 && punctaj < 90) ? "B" : 
			(punctaj >= 0 &&punctaj < 80) ? "S" : "Please insert a valid score";
		
		String mesaj = (calificativ == "FB") ? "Ai primit: Foarte Bine" : (calificativ == "B") ? 
			"Ai primit: Bine" : (calificativ == "S") ? "Ai primit: Suficient" : "Please enter a valid score";
		
		System.out.println(mesaj);
	}

}
