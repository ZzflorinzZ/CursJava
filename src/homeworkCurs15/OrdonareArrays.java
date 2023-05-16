package homeworkCurs15;

import java.util.Arrays;

public class OrdonareArrays<T> {
	
	static String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
	static Integer[] intArray = {100, 500, 300, 400, 200};
	static Character[] charArray = {'a', 'b', 'd', 'c'};
	

	public static void main(String[] args) {
/*
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
		Arrays.sort(textArray);
		System.out.println(Arrays.toString(textArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
*/
		orderingArrays(textArray);
		orderingArrays(intArray);
		orderingArrays(charArray);
		
	}
	

	public static<T> void orderingArrays(T[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
