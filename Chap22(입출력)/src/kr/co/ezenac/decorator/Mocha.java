package kr.co.ezenac.decorator;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();					//생략해도 됨.
		System.out.println("Adding Mocha Syrup");
		
	}
	
}
