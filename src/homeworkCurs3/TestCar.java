package homeworkCurs3;

public class TestCar {

	public static void main(String[] args) {
		
		Car obiect = new Car ("BMW", 2.2);
			System.out.println(obiect.carDetails());
		
			System.out.println("--------------------------");
		
		Car obiect2 = new Car ("Ford", 1.6);
		Car.type = "sedan";
			System.out.println(obiect2.carDetails());
		
			System.out.println("--------------------------");
			
			System.out.println(obiect.carDetails());


		
//========================================================
		
	//metoda alternativa, fara constructor si obiecte, dar pare ca nu mai foloseste variabilele statice brand si engine in metoda carDetails
		
/*	
			System.out.println(Car.carDetails(Car.brand = "BMW",Car.engine = 2.2));
			System.out.println("--------------------------");
		Car.type = "sedan";
			System.out.println(Car.carDetails(Car.brand = "Ford",Car.engine = 1.6));
			System.out.println("--------------------------");
			System.out.println(Car.carDetails(Car.brand = "BMW",Car.engine = 2.2));
*/			
	}

}



/*
 * Da, print-urile sunt corecte pt ca valoarea variabilei statice type a fost suprascrisa 
 * si pasteaza ultima valoare utilizata.
 * 
 */
