package curs14;

public class StringTransformation {

	public static void main(String[] args) {

		transformToString();
	

	}
	
	public static void transformToString() {
		
		char ch = 'a';
		String chStr = String.valueOf(ch);		
		String chStr2 = Character.toString(ch);		//Character este o clasa wrapper pt data type primitiv char
		System.out.println(chStr);
		System.out.println(chStr2);
		
		System.out.println("------------------------");
		
		boolean bol = true;
		String bolStr = Boolean.toString(bol);
		String bolStr2 = String.valueOf(bol);
		
		System.out.println(bolStr);
		System.out.println(bolStr2);
		
		String str = null;
//		System.out.println(str.toString());		//daca obiectul (indiferent de data type) vine null --> intra pe null pointer exception
		System.out.println(str.valueOf(str));	//daca obiectul vine null --> printeaza null
	}

}
