package homeworkCurs12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestTheLongestWord {

	public static void main(String[] args) {

		TheLongestWord obj = new TheLongestWord();

		obj.writeTxt("Comandă cu livrare gratuită!\r\n" + "\r\n"
				+ "Activează Genius și ai livrare gratuită și oferte exclusive pe eMAG, Tazz, Fashion Days și Freshful!\r\n"
				+ "Încearcă gratuit 30 zile! ");

		System.out.println("-------------------------------------------");

		obj.readTxt();

		System.out.println(obj.getTxt);

		System.out.println("-------------------------------------------");


	String[] getTxtArray = null;

		getTxtArray = obj.getTxt.split(" ");

		
		for(int i=0; i<getTxtArray.length; i++) { 
			System.out.println(getTxtArray[i]);
		}

		
		String longestWord = "";
		int longestWordLength = 0;
		int wordLength = 0;

		for (String element : getTxtArray) {
			for (int j = 0; j < element.length(); j++) {
				wordLength = j;
				if (wordLength > longestWordLength) {
					longestWordLength = wordLength;
					longestWord = element;
					wordLength = 0;
				} else if (wordLength == longestWordLength) {
					longestWord = longestWord + ", " + element;
					wordLength = 0;
				}
			}
		}

		System.out.println("The text longest word(s): " + longestWord);

	}

}
