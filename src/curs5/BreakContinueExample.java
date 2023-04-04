package curs5;

public class BreakContinueExample {

	public static void main(String[] args) {
		
		
		for (int i=0; i<10; i++) {
			
			if (i == 5) {
				//break;		//intrerupe executia cand se indeplineste conditia
				continue;		//daca nu vrem sa execute conditia; face skip si continua for-ul
			}
			
			System.out.println(i);
		}

	}

}
