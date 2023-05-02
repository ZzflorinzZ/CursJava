package curs13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		/*
		 * MAP = structura de tip collection collection
		 * 
		 */

		Map<String, String> map = new HashMap<>();

		System.out.println(map.size());

		System.out.println(map.isEmpty());

		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductOwner");

		System.out.println(map.size());

		System.out.println(map.isEmpty());
		
		
		System.out.println(map.get("T"));
		
		System.out.println("contains key: " + map.containsKey("x"));	
		System.out.println("contains key: " + map.containsValue("Manager"));
		
		System.out.println("------------------------------------------------");
		
		map.put("M", "Maradona");
		
		for(String key : map.keySet()) {
			System.out.println("key: " + key);
		}
		
		System.out.println("------------------------------------------------");
		
		map.put("D", "Maradona");
		
		for (String value : map.values()) {
			System.out.println("value: " + value);
		}
		
		System.out.println("------------------------------------------------");
		
		map.replace("D", "Diego");
		
		for (String value : map.values()) {
			System.out.println("value: " + value);
		}
		
		System.out.println("------------------------------------------------");
		
		map.remove("M");
		
		for (String value : map.values()) {
			System.out.println("value: " + value);
		}

	}

}
