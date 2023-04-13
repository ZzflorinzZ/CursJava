package curs6;

public class DoWhileExample {

	public static void main(String[] args) {


		String[] array = {"zero", "unu", "doi", "trei"};
		
		//index				0		1		2		3
		
		int i = 0;
		while (i<array.length) {
			System.out.println(array[i]);
			i++;
		}
		
		System.out.println("=========================");

		
		int j = 0;
		do {
			System.out.println(array[j]);		//se executa corpul buclei cel putin o data, indiferent daca
			j++;								//conditia este adevarata sau falsa
		}while (j>array.length);
	} 

}
