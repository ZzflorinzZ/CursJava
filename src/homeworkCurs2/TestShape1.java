package homeworkCurs2;

public class TestShape1 {

	public static void main(String[] args) {
		
		Shape1 patrat = new Shape1(8);
		//patrat.setLength(8);
		
		Shape1 dreptunghi = new Shape1(4,2);
		//dreptunghi.setLength(4);
		//dreptunghi.setWidth(2);
		
		Shape1 cerc = new Shape1(3.0);
		//cerc.setRadius(3.0);

	System.out.println("The area of the square is: " + patrat.calculateSquareArea());
	System.out.println("The area of the rectangle is: " + dreptunghi.calculateRectangleArea());
	System.out.println("The area of the circle is: " + cerc.getRadius()*cerc.getRadius()*Math.PI);
	
	}

}
