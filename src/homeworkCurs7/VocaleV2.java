package homeworkCurs7;

public class VocaleV2 {

	public static void main(String[] args) {


		String text = "Eu invat Java abciou";
		int numarVocale = 0;
	
		text = text.toLowerCase();
		
		for(int i=0; i<text.length(); i++) {
			char character = text.charAt(i);
		
		switch (character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			numarVocale++;				
		}	
		
		}
		System.out.println("Vocale: " + numarVocale);
	}

}
