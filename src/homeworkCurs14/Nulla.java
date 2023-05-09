package homeworkCurs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nulla {

	public static void main(String[] args) {

		String text = "Lorem ipsum dolor sit amet, consectetur "
				+ "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu "
				+ "eleifend felis imperdiet? Integer bibendum nunc quis sem faucibus, "
				+ "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
				+ "malesuada. Nulla neque lacus, euismod quis erat nec, convallis "
				+ "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
				+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

		nullaCounter(text);
		System.out.println("-------------------");
		sentancesSplit(text);
		System.out.println("-------------------");
		deleteA(text);
		System.out.println("-------------------");
		replaceLetterO(text, "#");

	}

	public static void nullaCounter(String text) {
		int nullaContor = 0;
		
		String[] textArray = text.split(" ");
		
//		System.out.println(Arrays.toString(textArray));

		for (String word : textArray) {
			if (word.equalsIgnoreCase("Nulla")) {
				nullaContor++;
			}
		}
		System.out.println(nullaContor);
	}
	

	 

	public static void sentancesSplit(String text) {
	
		StringBuilder sentance = new StringBuilder(text);
		String[] sentances = sentance.toString().split("[.?]");

		for (int i = 0; i < sentances.length; i++) {
			System.out.println(sentances[i]);
		}
	}

	public static void deleteA(String text) {
		StringBuilder textWithoutA = new StringBuilder(text);
		for (int i = 0; i < textWithoutA.length(); i++) {
			if (String.valueOf(textWithoutA.charAt(i)).equalsIgnoreCase("a")) {
				textWithoutA.deleteCharAt(i);
			}
		}
		System.out.println(textWithoutA);
	}

	public static void replaceLetterO(String text, String textToReplace) {
		StringBuilder textWithDiez = new StringBuilder(text);
		for (int i = 0; i < textWithDiez.length(); i++) {
			if (String.valueOf(textWithDiez.charAt(i)).equalsIgnoreCase("o")) {
				textWithDiez.replace(i, i + 1, textToReplace);
			}
		}
		System.out.println(textWithDiez);
	}

}
