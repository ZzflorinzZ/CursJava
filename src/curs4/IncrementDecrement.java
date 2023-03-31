package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//increment
		//nr++	==> nr = nr + 1	==> nr += 1
		
		//nr++	==> post increment
		//++nr	==> pre increment
		
		//decrement
		//nr--	==> post decrement
		//--nr	==> pre decrement
		
		System.out.println("-----POST-----");
		int num = 5;
		System.out.println("Valoarea lui num inainte de increment: " + num);
		System.out.println("Valoarea lui num in POST increment: " + num++);	//dupa executie se face increment-ul
		System.out.println("Valoarea lui num dupa increment: " + num);
		
		
		System.out.println("-----PRE-----");
		int num2 = 10;
		System.out.println("Valoarea lui num2 inainte de increment: " + num2);
		System.out.println("Valoarea lui num2 in POST increment: " + ++num2);	//inainte de executie se face increment-ul
		System.out.println("Valoarea lui num2 dupa increment: " + num2);
		
		//in structurile de tip bucla nu conteaza daca este PRE sau POST increment
		//in structurile matematice PRE increment intai executa incrementul, apoi linia de cod pe care se afla
		//in structurile matematice POST increment intai executa linia de cod pe care se afla, apoi face incrementarea
		
		
		//decrement
		int num3 = 3;
		System.out.println(num3--);	//POST decrement
		System.out.println(num3);
		
		System.out.println(--num3);	//PRE decrement
		
	}

}
