package curs11;

public class Laptop extends Product{

	private int buyingPrice;
	private int vat;
	private int adaos;
	
	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyingPrice + vat + adaos;
	}
	
	public Laptop(int buyingPrice, int vat, int adaos) {
		this.buyingPrice = buyingPrice;
		this.vat = vat;
		this.adaos = adaos;
	}

}
