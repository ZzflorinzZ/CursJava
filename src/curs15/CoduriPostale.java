package curs15;

import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {
	
	Map<Integer, String> cp;
	
	
	public CoduriPostale() {
		cp = new HashMap<Integer, String>();
		cp.put(303, "Cluj");
		cp.put(117, "Pitesti");
		cp.put(707, "Iasi");
		cp.put(200, "Buzau");
		cp.put(404, "Bucuresti");
		cp.put(908, "Constanta");
	}
	
	public void postalCodeSearch(int codPostal) throws CodPostalException {
		if(cp.containsKey(codPostal)) {
			System.out.println("Orasul asociat codului " + codPostal + "este " + cp.get(codPostal));
		}else {
			throw new CodPostalException("Codul postal nu exista");				
		}
	}

}
