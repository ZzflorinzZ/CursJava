package curs4;

public class TernaryOperator {

	public static void main(String[] args) {
		
		
		int a = 60;
		int b = 130;
		
		int x;
		
		if(a>b) {
			x = a;
		}else {
			x = b;
		}
		System.out.println(x);
		
		
		int y = a>b ? a :b;
		System.out.println(y);
		
		//===============================
		
		int num1 = 5;
		int num2 = 10;
		int num3 = 8;
		
		int z = (num1>num2) ? num1 : (num2>num3) ? num2 : num3;

		
	}

}
