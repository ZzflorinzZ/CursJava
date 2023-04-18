package curs9;

public class TestShape {

	public static void main(String[] args) {


		Shape shape = new Shape();
		
		shape.draw();
		shape.printClass();		
		System.out.println(shape.nume);
		
		System.out.println("----------------------------------");
		
		Patrat patrat = new Patrat();
		patrat.draw();
		patrat.printClass();
		System.out.println(patrat.nume);

		System.out.println("----------------------------------");
		
		Cerc cerc = new Cerc();
		cerc.draw();
		cerc.printClass();
		System.out.println(cerc.nume);
	}

}
