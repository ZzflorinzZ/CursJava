package curs7;

public class ArrayExample {

	public static void main(String[] args) {


		String[] textArray = new String[5];
	//	String[] textArray = {null, null, null, null, null}
	//	index					0	1		2	3		4
		
		System.out.println(textArray[2]);
		
		textArray[0] = "This";
		//	String[] textArray = {"This", null, null, null, null}
		//	index					0		1	2		3	4
		
		textArray[1] = " is";
		textArray[2] = " an";
		System.out.println(textArray[2]);
	//	String[] textArray = {"This", " is", " an", null, null}
		textArray[3] = " array";
		textArray[4] = "!";
	//	String[] textArray = {"This", " is", " an", " array", "!"}
		
		
		//array-urile se parcurg in general cu FOR
		
/*		try {
			System.out.println(textArray[5]);
		
		}catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage());
		}
*/		
		for(int i=0; i < textArray.length; i++ ) {
			System.out.print(textArray[i]);
		}
		
	//	System.out.println(textArray[5]);
		//This is an array!Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds 
		//for length 5 at curs7.ArrayExample.main(ArrayExample.java:33)
		//se intrerupe executia

		System.out.println("");
		System.out.println("-----------------------------");
		
		for(String obj : textArray) {	// for each object from textArray
			System.out.print(obj);		//for each - se foloseste doar pt elemente inlantuite
		}
	}

}
