package curs12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.print.DocFlavor.INPUT_STREAM;

public class PropertiesFileProcesor {

	// write properties

	public void writePropertiesFile() {

		try (OutputStream outStream = new FileOutputStream("test.properties")) { // try with resource - face close
																					// singur

//		try {
			// OutputStream outStream = new FileOutputStream("test.properties"); //canal
			// comunicare
			// cheie = valoare ==> nume = "Ion" ==> nume este cheie, Ion este valoare
			Properties propFile = new Properties();
			propFile.setProperty("user", "TestUser");
			propFile.setProperty("pass", "Pass123");
			propFile.setProperty("email", "test.user@test.com");

			propFile.store(outStream, "am salvat fisier!");

//			outStream.close();  //canalele de comunicare trebuie inchise 

		} catch (IOException e) {
			System.out.println("Cannot write the prop file!");
		}
	}

	// read properties
	public void readPropertiesFile(String key) {

		try (InputStream inputStream = new FileInputStream("test.properties")) {

			Properties propFile = new Properties();
			propFile.load(inputStream);

			System.out.println(propFile.getProperty(key));

		} catch (IOException e) {
			System.out.println("Cannot read the prop file!");
		}

	}

	// update properties
	public void updatePropertiesFile(String key, String value) {

		Properties propFile = new Properties();
		// incarcare fisier
		try (InputStream inputStream = new FileInputStream("test.properties")) {

			propFile.load(inputStream);

		} catch (IOException e) {
			System.out.println("Cannot write the prop file!");
		}

		try (OutputStream outStream = new FileOutputStream("test.properties")) {

			propFile.setProperty(key, value);

			propFile.store(outStream, null);

		} catch (IOException e) {
			System.out.println("Cannot write the prop file!");
		}
	}

	
	//delete from properties file
	
public void deleteFromProperties(String key) {
	Properties propFile = new Properties();
	// incarcare fisier
	try (InputStream inputStream = new FileInputStream("test.properties")) {

		propFile.load(inputStream);

	} catch (IOException e) {
		System.out.println("Cannot write the prop file!");
	}

	try (OutputStream outStream = new FileOutputStream("test.properties")) {

		propFile.remove(key);

		propFile.store(outStream, null);

	} catch (IOException e) {
		System.out.println("Cannot write the prop file!");
	}
}
	
	
	
	
	
}
