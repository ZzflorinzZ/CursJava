package curs2;

public class Rectangle {
	
	private int lenght;
	private int width;
	
	public Rectangle() {}	//constructorul clasei; nu returneaza niciodata nimic
	
	public Rectangle(int lenght, int width) {
		setLenght(lenght);
		setWirdth(width);
	}
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWirdth() {
		return width;
	}
	public void setWirdth(int width) {
		this.width = width;
	}
	
	
	public int calculateArea() {
		return lenght * width;
		
	}
	

}
