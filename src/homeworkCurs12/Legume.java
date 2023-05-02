package homeworkCurs12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Legume {
	
//	public String calorii;	
	//am definit variabila asta fiindca nu mi-am dat seama cum as fi putut sa scot nrCaloriiLegume.getProperty(leguma)
	//in afara metodei readFisierLegume pt a o putea utiliza ca si conditie in metoda de executie

	public void writeFisierLegume() {

		try (OutputStream outLegume = new FileOutputStream("calorii.legume")) {
			Properties nrCaloriiLegume = new Properties();
			nrCaloriiLegume.setProperty("conopida", "66");
			nrCaloriiLegume.setProperty("castravete", "33");
			nrCaloriiLegume.setProperty("morcov", "44");
			nrCaloriiLegume.setProperty("cartof", "55");
			nrCaloriiLegume.setProperty("salata", "22");

			nrCaloriiLegume.store(outLegume, "Fisier salvat cu succes");
		} catch (IOException e) {
			System.out.println("Eroare la scrierea in fisier");
		}
	}

/*	public void readFisierLegume(String leguma) {

		try (InputStream inputLegume = new FileInputStream("calorii.legume")) {
			Properties nrCaloriiLegume = new Properties();
			nrCaloriiLegume.load(inputLegume);
			calorii = nrCaloriiLegume.getProperty(leguma);
		}catch (IOException e) {
			System.out.println("Eroare la citirea din fisier");
		}
	}
*/
	
	public String readFisierLegume(String leguma) {
			String calorii = null;
		try (InputStream inputLegume = new FileInputStream("calorii.legume")) {
			Properties nrCaloriiLegume = new Properties();
			nrCaloriiLegume.load(inputLegume);
			calorii = nrCaloriiLegume.getProperty(leguma);
		}catch (IOException e) {
			System.out.println("Eroare la citirea din fisier");
		}
		return calorii;
	}
	
	
}
