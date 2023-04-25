package curs11;

public abstract class Product { //clasa abstracta functioneaza ca un template
								//clasa abstracta nu poate avea variabile abstracte
								//clasa abstracta poate avea 0 sau mai multe metode abstracte
								//clasa abstracta poate avea si metode normal
	
	public abstract int calculatePrice(); //metoda abstracta
	
	
	public void productRating() {				//metoda normala
		System.out.println("Best product!");
	}

}
