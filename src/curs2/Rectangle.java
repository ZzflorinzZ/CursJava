package curs2;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {}	//constructorul clasei; nu returneaza niciodata nimic
	
	public Rectangle(int length, int width) {
		setLength(length);
		setWidth(width);
	}
	
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
	
	
	public int calculateArea() {
		return length * width;
		
	}
	

}
