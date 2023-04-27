package homeworkCurs11;

public class Human extends Primate implements BasicNeeds{

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Omnivore";
	}

	@Override
	public void walk() {
		System.out.println("can walk");
		
	}

	@Override
	public void run() {
		System.out.println("can run");
		
	}

	@Override
	public void speak() {
		System.out.println("I can speak!");
		
	}

	

}
