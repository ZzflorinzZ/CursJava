package curs8;

public class TestSquare {

	public static void main(String[] args) {


		Square patrat = new Square(null, null);
		
	//	Shape patrat2 = new Square();	// tine de polimorfism (obiect care poate lua mai multe forme)
		
		
		System.out.println(patrat.nume);
		System.out.println(patrat.culoare);
		
		// daca exista 2 variabile cu acelasi nume, va executa intotdeauna variabila din cea mai apropiata instanta 
		// (din clasa instantiata)

		
		//daca ai nevoie sa executi obiectul din clasa parinte intra in schema cuvantul super
		
		
		patrat.printDetails();
	}

}
