package curs10;

public class Produse {
	
	private String nume;
	private double pretVanzare;
	public final double TVA = 19.0; //daca variabila este scrisa cu CAPS, ea este considerata constanta

	
	public double pret() {
		return pretVanzare + (pretVanzare*TVA);
	}

	
	public Produse (String nume) {	// variabila nume nu va putea fi accesata, doar se poate seta valoare pe ea
		this.nume = nume;			// constructorul nu se mosteneste	
	}

	public double getPretVanzare() {
		return pretVanzare;
	}
	public void setPretVanzare(double pretVanzare) {
		this.pretVanzare = pretVanzare;
	}



}
