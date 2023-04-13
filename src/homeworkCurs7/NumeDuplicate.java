package homeworkCurs7;

/*
 * Scriem un program care verifica daca avem nume duplicate in urmatorul array :
 * String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
 * Daca le gaseste , printeaza :
 * 		Nume duplicat Ion
 * 		Nume duplicat Oana
 * 
 */

public class NumeDuplicate {

	static String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };

	static int contorMaria = 0;
	static int contorBob = 0;
	static int contorIon = 0;
	static int contorGeorge = 0;
	static int contorOana = 0;
	static int contorBogdan = 0;

	public void comparatorNume() {

		for (int i = 0; i < myStringArray.length; i++) {

//			System.out.println(myStringArray[i]);		

			switch (myStringArray[i]) {
			case "Maria":
				contorMaria++;
				// System.out.println(contorMaria);
				break;
			case "Bob":
				contorBob++;
				// System.out.println(contorBob);
				break;
			case "Ion":
				contorIon++;
				// System.out.println(contorIon);
				break;
			case "George":
				contorGeorge++;
				// System.out.println(contorGeorge);
				break;
			case "Oana":
				contorOana++;
				// System.out.println(contorOana);
				break;
			case "Bogdan":
				contorBogdan++;
				// System.out.println(contorBogdan);
				break;
			default:
			}
		}
	}

	public void printNumeDuplicate() {				// nu cred ca imi dau seama cu ce as fi putut inlocui 
													// if-urile astea ca sa arata mai curat

		if (contorMaria > 1) {
			System.out.println("Nume duplicat: Maria");
		}
		if (contorBob > 1) {
			System.out.println("Nume duplicat: Bob");
		}
		if (contorIon > 1) {
			System.out.println("Nume duplicat: Ion");
		}
		if (contorGeorge > 1) {
			System.out.println("Nume duplicat: George");
		}
		if (contorOana > 1) {
			System.out.println("Nume duplicat: Oana");
		}
		if (contorBogdan > 1) {
			System.out.println("Nume duplicat: Bogdan");
		}
	}

	public static void main(String[] args) {

		NumeDuplicate obj = new NumeDuplicate();

		obj.comparatorNume();
		obj.printNumeDuplicate();
	}

}
