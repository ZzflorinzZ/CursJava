package homeworkCurs5;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
	//	obj.fibonacciFor();
		obj.fibonacciWhile();
		
	}	
	
	public void fibonacciFor() {
		
		int n1 = 0;
		int n2 = 1;
		int contor = 1;
		
		int valoareContor = 0;
		
		String serieFibonacci = "";
		
		for (int i = contor; i <= 9; i++) {
			serieFibonacci = serieFibonacci + " " + n1;
			valoareContor = n1 + n2;
			n1 = n2;
			n2 = valoareContor;
		}
		System.out.println("Seria Fibonacci pentru 9 numere este: " + serieFibonacci);
	}	

	
	public void fibonacciWhile() {
		
		int n1 = 0;
		int n2 = 1;
		int contor = 1;
		
		int valoareContor = 0;
		
		String serieFibonacci = "";
		
		while (contor <= 9) {
			serieFibonacci = serieFibonacci + " " + n1;
			valoareContor = n1 + n2;
			n1 = n2;
			n2 = valoareContor;
			contor++;
		}
		System.out.println("Seria Fibonacci pentru 9 numere este: " + serieFibonacci);
	}
	
	
}
