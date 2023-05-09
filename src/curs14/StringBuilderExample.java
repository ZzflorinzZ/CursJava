package curs14;

public class StringBuilderExample {

	public static void main(String[] args) {

		reverseString("masina");
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
		deleteFromString("masina", 2, 5);
		insertIntoString("Salut ", 6, "Ion");
		addSpacesToText("thisIsACamelCaseText");
	}
	
	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, int startIndex, int EndIndex, String textToReplace) {
		StringBuilder sb = new StringBuilder(text);
		sb.replace(startIndex, EndIndex, textToReplace);
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text, int startIndex, int EndIndex) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, EndIndex);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, String textToBeInserted) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToBeInserted);
		System.out.println(sb);
	}
	
	public static void addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder(text);
		for(int i=0; i<sb.length(); i++) {
			if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
		}
		System.out.println(sb);
	}

}
