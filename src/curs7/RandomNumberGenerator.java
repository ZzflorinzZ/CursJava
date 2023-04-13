package curs7;

import java.util.Arrays;
import java.util.Random;

/*
 * facem un program care genereaza 6 numere intre 0 si 9
 * le tine intr-un array
 * nu tinem numere duplicate
 * printam array-ul
 * 
 * 
 * o metoda care genereaza si le pune in array
 * o metoda care nu permite duplicat
 * o metoda care printeaza
 * 
 * 
 */
public class RandomNumberGenerator {
	
	public int[] generateNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		int randomNr = 0;
		
		for(int i = 0; i<numbers.length; i++) {
			do {
				randomNr = random.nextInt(9);
				System.out.println(randomNr);
			}while(checkDuplicateNumber(numbers, randomNr));
			numbers[i] = randomNr;
		}
		return numbers;
	}	
	
	public boolean checkDuplicateNumber(int[] array, int nr) {
		for(int number: array) {
			if(nr == number) {
				return true; 
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		
		RandomNumberGenerator rn = new RandomNumberGenerator();
		
		System.out.println(Arrays.toString(rn.generateNumbers()));

	}

}
