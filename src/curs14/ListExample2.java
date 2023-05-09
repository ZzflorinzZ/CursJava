package curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei"));
		
		list.add("patru");
		list.add("cinci");
		
		System.out.println(list.contains("opt"));
		
		list.subList(1, 4).clear();		//indexul de inceput este inclus, iar cel de final este exclus
		
		System.out.println("--------------------");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		System.out.println("--------------------");
		
		list.add("zero");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		//update in lista
		list.set(3, "sase");
		System.out.println("get eleement " + list.get(3));

	}

}
