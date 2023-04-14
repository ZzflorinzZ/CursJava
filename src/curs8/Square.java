package curs8;

public class Square extends Shape{
	
	public Square(String culoare, String nume) {
		super(culoare, nume);
		
	}

//	public String nume = "patrat";
	public String culoare = "negru";
	
	public void printDetails() {
		nume = "galben";
		System.out.println("Numele este: " + super.nume + " si culoarea este: " + super.culoare);
	}	

}
