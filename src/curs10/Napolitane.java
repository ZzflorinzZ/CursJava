package curs10;

public class Napolitane extends Produse{

	private double nrBucatiBax;
	private int cantitate;

	public Napolitane(String nume, double pretVanzare, double nrBucatiBax, int cantitate) {
		super(nume);
		setPretVanzare(pretVanzare);
		this.nrBucatiBax = nrBucatiBax; 
		this.cantitate = cantitate; 
	}
	
	
	@Override
	public double pret() {
		return (getPretVanzare()/nrBucatiBax*cantitate) + (getPretVanzare()/nrBucatiBax*cantitate*TVA); 
	}

}
