package homeworkCurs9;

public class Bicicleta extends Vehicul{
	
	
	public Bicicleta (String brand, int nivelPoluare, String vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	@Override
	public String nume(String nume) {
		return nume;
	}
	
	@Override
	public String motorizare(String motorizare) {
		return motorizare; 
	} 
	
	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru bicicleta " + getBrand() + " este: " + getNivelPoluare() + 
				" si viteza medie atinsa este de " + getVitezaMedie());
	}

	
}
