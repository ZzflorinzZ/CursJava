package curs9;

public class TestAnimal {

	public static void main(String[] args) {

/*
		Animal animal = new Animal();
		animal.makeSound();
		
		System.out.println("---------------------");
		
		Lion leu = new Lion();
		leu.makeSound();
		leu.eatMeat();
		
		System.out.println("---------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		
		//WebDriver driver = new ChromeDriver(); --obiectul WebDriver apartine de o clasa si constructorul Chromedriver de alta clasa
		
		*/

		
		Animal simba = new Lion(); //constructorul - Lion - ii spune de ce clasa apartine
		simba.makeSound();
		((Lion)simba).eatMeat(); //Lion lion - new Lion();
		feedAnimal(simba);
		
		
		simba = new Deer();		//polimorfism pur (acelasi obiect - simba - ia mai multe forme
		simba.makeSound();
		((Deer)simba).eatGrass();
		feedAnimal(simba);
		
	}
	
	
	public static void feedAnimal(Animal animal) {
		if(animal instanceof Lion) { //te ajuta sa vezi a carei instanta este obiectul respectiv
			System.out.println("You are getting burgers!");
		}else if (animal instanceof Deer) {
			System.out.println("You are getting salad!");
		}
	}

}
