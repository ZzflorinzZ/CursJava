package homeworkCurs9;

public class VerificareVehicul {

	
	
	public static void verificaMotorizarea(Vehicul vehicul) { 
		if(vehicul instanceof Bicicleta) {
			System.out.println(vehicul.nume("X Vert") + " - " + vehicul.motorizare("Electrica"));
		}else if(vehicul instanceof Masina) {
			System.out.println(vehicul.nume("Santa Fe") + " - " + vehicul.motorizare("Hybrid"));
		}
		
	}
	
	
	public static void main(String[] args) {

		VerificareVehicul obj = new VerificareVehicul();

		Vehicul bicicleta = new Bicicleta("Corratec", 0, "25 km/h");
		Vehicul masina = new Masina("Hyundai", 2, "140 km/h"); 

		
		
		verificaMotorizarea(bicicleta);
		bicicleta.detaliiVehicul();

		System.out.println("===================================");

		verificaMotorizarea(masina);
		masina.detaliiVehicul();
	}

}
