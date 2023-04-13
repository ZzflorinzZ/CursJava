package homeworkCurs7;

/*
 * Scriem un program care numara cate vocale contine textul ” Eu invat Java”.
 * Va printa urmatorul mesaj : Vocale: nr de vocale din text
 * 
 */

public class Vocale {

	public static void main(String[] args) {


		String[] text = {"Eu ", "invat ", "Java"};		
	//	char[] vocale = {'a','e','i','o','u','A','E','I','O','U'}; 		// nefolosit (cred ca pornisem pe o cale gresita)
		int numarVocale = 0;
		
//		String elementText = "";		// mi-am dat seama ca nu e nevoie de variabila asta
										// desi cred ca s-ar intelege mai usor codul daca o folosesc
		
		
		for (int i = 0; i<text.length; i++) {
//			elementText = String.valueOf(text[i]);
	//		System.out.println(elementText);
			
			int j = 0;
			do {
				switch (String.valueOf(text[i]).charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					numarVocale++;
	//				break;					// a trebuit sa elimin break-ul din switch ca sa nu intrerupa executia
				default:
					
				j++;											// ???			
				}												// desi programul functioneaza,
			}while (j < String.valueOf(text[i]).length());		// nu inteleg de ce java a vrut <<.length()>>
																// in loc de  <<.length>>
		}											
			
			System.out.println("Vocale: " + numarVocale); 
		}
	
	}


