package homeworkCurs4;

public class ComisionVanzari {

	
	public static void main(String[] args) {
		
		int comision, vanzari = 3500;
		
		if (vanzari > 2500) {
			comision = vanzari * 5/100;
			System.out.println("comisionul tau este: " + comision);
		}else {
			comision = 0;
			System.out.println("comisionul tau este: " + comision);
		}

	}

}
