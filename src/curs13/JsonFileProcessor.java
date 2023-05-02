package curs13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileProcessor {

	public void writeJsonFile() {

		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		obj.put("email", "email@testuser.com");

		JSONArray list = new JSONArray();
		list.add("Obiect 1");
		list.add("Obiect 2");
		list.add("Obiect 3");
		list.add("Obiect 4");
		list.add("Obiect 5");

		obj.put("listaObiecte", list);

		try (FileWriter file = new FileWriter("test.json")) {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readJsonFile(String key) throws ParseException {

		JSONParser parser = new JSONParser(); // stie sa parcurga structura json

		try {
			FileReader jsonFile = new FileReader("test.json"); // incarca fisierul in canalul de comunicare
			JSONObject jsonObj = (JSONObject) parser.parse(jsonFile); // obiect json caruia ii atrebuim valoarea parsata
			System.out.println(jsonObj);

			String obiect = (String) jsonObj.get(key);
			System.out.println("Key: " + obiect);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readJsonArray(String key) throws ParseException {

		JSONParser parser = new JSONParser(); // stie sa parcurga structura json

		try {
			FileReader jsonFile = new FileReader("test.json"); // incarca fisierul in canalul de comunicare
			JSONObject jsonObj = (JSONObject) parser.parse(jsonFile); // obiect json caruia ii atrebuim valoarea parsata
			System.out.println(jsonObj);

			JSONArray obiect2 = (JSONArray) jsonObj.get(key);
			System.out.println("JSON Array " + obiect2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//update
	public void updateJsonFile(String key, String value) throws ParseException, IOException {

		try (FileReader jsonFile = new FileReader("test.json")) {

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);

			jsonObject.put(key, value);

			try (FileWriter file = new FileWriter("test.json")) {
//			FileWriter file = new FileWriter("test.json");
				file.write(jsonObject.toJSONString());
//			file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	//delete
	public void deleteFramJsonFile(String key) {
		
		try (FileReader jsonFile = new FileReader("test.json")) {

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);

			jsonObject.remove(key);

			try (FileWriter file = new FileWriter("test.json")) {

				file.write(jsonObject.toJSONString());


			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
