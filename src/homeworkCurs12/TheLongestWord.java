package homeworkCurs12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class TheLongestWord {
	
	public String getTxt = "";
	
	//create txt file
	public void writeTxt (String text) {
		
		try (FileWriter txtWriting = new FileWriter("random.txt")){
			 
			txtWriting.write(text);
			System.out.println("Writing successfully");
			
		}catch (IOException e) {
			System.out.println("Writing error");
		}
	}
	
	
	//read txt file
	public void readTxt() {
		
		File txtReaging = new File("random.txt");
		
		try(Scanner scan = new Scanner(txtReaging)){
			while(scan.hasNext()) {
	//			System.out.println(scan.nextLine());
				getTxt = getTxt + " " + scan.nextLine();
			}	
		}catch (IOException e) {
			System.out.println("Reading error");
		}
	}
	

}
