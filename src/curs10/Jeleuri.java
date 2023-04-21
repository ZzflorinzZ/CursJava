package curs10;

public class Jeleuri extends Produse{
	
	private double cantitate;

	public Jeleuri(String nume, double pretVanzare, double cantitate) {
		super(nume);
		setPretVanzare(pretVanzare);
		this.cantitate = cantitate;
	}
	
	
	@Override
	public double pret() {
		return (getPretVanzare()*cantitate) + (getPretVanzare()*cantitate*TVA);
	}

}
