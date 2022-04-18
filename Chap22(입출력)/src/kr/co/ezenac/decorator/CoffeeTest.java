package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		 Coffee aAmericano = new AAmericano();
		 aAmericano.brewing();
		 System.out.println();
		 
		 Coffee latte1 = new  Latte(new BAmericano());
		 latte1.brewing();
		 System.out.println();
		 
		 Coffee mocha1 = new Mocha(new Latte(new BAmericano()));
		 mocha1.brewing();
		 System.out.println();
		 
		 Coffee ezenITMocha = new Mocha(new Latte(new BAmericano()));
		 ezenITMocha.brewing();
		
	}
	
	
}
