package curs12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	//write txt file	
	public void writeFile(String text) {
		
		try(FileWriter fileWrite = new FileWriter("file2.txt")){
			
			fileWrite.write(text);
			System.out.println("Am scris in fisier!");
			
		}catch(IOException e) {
			System.out.println("Cannot write file!");
		}
	}
	
	
	//read from txt file
	public void readTxtFile() {
		
		File objFile = new File("file.txt");
		
		try(Scanner scan = new Scanner(objFile);){
	//		File objFile = new File("file2.txt");
	//		Scanner scan = new Scanner(objFile);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}

			
		}catch (IOException e) {
			System.out.println("Cannot read file!");
		}
	}
	
	
	//update txt file
	public void updateTxtFile(String text) {
		
			
			try(FileWriter fileWrite = new FileWriter("file.txt", true)){
				
				fileWrite.append(text);
				System.out.println("Am scris in fisier!");
				
			}catch(IOException e) {
				System.out.println("Cannot write file!");
			}
		
	}
	
	
	//delete file
	public void deleteFile() {
		File file = new File("file.txt");
		file.delete();
	}

}
