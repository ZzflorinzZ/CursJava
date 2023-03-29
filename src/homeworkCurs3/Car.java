package homeworkCurs3;

public class Car {
	
	public static String brand;
	public static String type = "Suv";
	public static double engine;
	
	
	public Car (String brand, double engine) {
		Car.brand = brand;
		Car.engine = engine;
	}
	

	public static String carDetails() {
		return "All " + brand + " cars are " + engine + " and are of type " + type;
	}

//===================================================
	
	//metoda pt solutia alternativa
	
/*
	public static String carDetails(String brand, double engine) {
		return "All " + brand + " cars are " + engine + " and are of type " + type;
	}
*/

	
}
