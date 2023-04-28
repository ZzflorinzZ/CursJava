package curs12;

public class TestTextFileProcessor {

	public static void main(String[] args) {


		TextFileProcessor txt = new TextFileProcessor();
	//	txt.writeFile("user=TestUser");
		txt.writeFile("pass=PassTestUser\n");
		txt.readTxtFile();

		System.out.println("-----------------------------");
		
		txt.updateTxtFile("user=TestUser");
		txt.readTxtFile();
		
		txt.deleteFile();
	}

}
