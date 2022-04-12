package kr.co.ezenac.singleton2;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myPalisade = factory.createCar();
		Car yourPalisade = factory.createCar();
		
		System.out.println(myPalisade.getCarNum());
		System.out.println(yourPalisade.getCarNum());
	}

}
