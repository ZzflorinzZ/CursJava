package curs8;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {


		String[][] textarray = new String[2][3];
		
		/*
		 * 
		 * 							Column 0	Column 1	Column 2
		 * 
		 *  textArray --> 	row 0	Brasov		Iasi		Bacau
		 * 
		 * 					row 1	Berlin		Paris		Roma
		 * 
		 * 
		 */
		
		textarray[0][0] = "Brasov";
		textarray[0][1] = "Iasi";
		textarray[0][2] = "Bacau";
		
		
		textarray[1][0] = "Berlin";
		textarray[1][1] = "Paris";
		textarray[1][2] = "Roma";
		
		
		System.out.println(textarray.length);
		
		System.out.println(textarray[0].length);
		
		
		for(int i=0; i<textarray.length; i++) {
			System.out.println("ROW" + Arrays.toString(textarray[i]));
			
			for(int j=0; j<textarray[0].length; j++) {
				System.out.println("Column " + textarray[i][j]);
			}
		}

	}

}
