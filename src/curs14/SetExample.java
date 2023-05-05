package curs14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	//setul nu permite elemente duplicate
	//set-ul exinde Collection (MAP-ul nu mosteneste Collection, dar a fost adaugat in Collection)
	//set-ul este o structura neordonata de elemente
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("mov");
		set.add("alb");
		set.add("rosu");
		set.add("galben");
		set.add("galben");
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println(set.contains("alb"));
		System.out.println("----------ITERATOR----------");
		
		set.remove("mov");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("--------------------");
		
		set.clear();
		
		
		System.out.println("--------------------");
		
		System.out.println(set.isEmpty());
		
	}
	
}
