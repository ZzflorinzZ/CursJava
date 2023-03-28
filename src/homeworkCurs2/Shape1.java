package homeworkCurs2;

public class Shape1 {
	
	private int length;
	private int width;
	private double radius;	
//=============================================
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}	
//=============================================
	//public Shape1() {}
		
	public Shape1 (int length) {
			setLength(length);
		}	
		
	public Shape1 (int length, int width) {
			setLength(length);
			setWidth(width);
		}
			
	public Shape1 (double radius) {
			setRadius(radius);
		}
//=============================================
	public int calculateSquareArea() {
		return length * length;
	}
	
	public int calculateRectangleArea() {
		return length * width;
	}
	
}
