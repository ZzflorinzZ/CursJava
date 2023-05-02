package curs13;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestJsonFile {

	public static void main(String[] args) throws ParseException, IOException {


		JsonFileProcessor jsProcess = new JsonFileProcessor();
		jsProcess.writeJsonFile();
		
		jsProcess.readJsonFile("name");
		jsProcess.readJsonFile("email");
		jsProcess.readJsonArray("listaObiecte");
		
		jsProcess.updateJsonFile("email", "altEmail");
//		jsProcess.updateJsonFile("listaObiecte", "altEmail");
		
		jsProcess.deleteFramJsonFile("name");

	}

}
