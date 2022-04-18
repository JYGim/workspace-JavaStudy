package kr.co.ezenac.decorator;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		
	}

	@Override
	public void brewing() {
		coffee.brewing();
		System.out.println("Adding Milk");
		
		
	}
	
	
	
}
