package curs2;

public class MethodExample {

	public static void main(String[] args) {
		
		int lenght = 4;
		int width = 2;
		int roomArea = lenght * width;
		System.out.println("Aria camerei este:" + roomArea);
		
		
		int lenght2 = 6;
		int width2 = 2;
		int roomArea2 = lenght2 * width2;
		//System.out.println("Aria camerei este:" + roomArea2);
		
		
		System.out.println("==============================");
		MethodExample obj = new MethodExample();
		obj.calculateArea(4, 4);
		obj.calculateArea(5, 4);
		obj.calculateArea(3, 4);
		
		System.out.println("Aria camerei este:" + obj.calculateArea2(3,4));
	}

	
	public void calculateArea(int lenght, int width) {
		
		int roomArea = lenght * width;
		System.out.println("Aria camerei este:" + roomArea);
		
		
	}
	
	/*void = return type;
			= nu intoarce nimic
	*/
	
	public int calculateArea2(int lenght, int width) {
		int roomArea = lenght * width;
		return roomArea;
		
		
	}
}
