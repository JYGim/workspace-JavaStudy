package kr.co.ezenac.polymorphism2;

import kr.co.ezenac.polymorphism2.PoliceCar;
import kr.co.ezenac.polymorphism2.SportCar;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sportCar = new SportCar();
		PoliceCar policeCar = new PoliceCar();
		
		sportCar.speedUp();
		
		car = sportCar;				//업캐스팅
		//car.speedUp();			//SportCar의 메서드는 안 보인다.
		
		SportCar sportCar2 = null;
		sportCar2 = (SportCar)car;	//다운캐스팅
		sportCar2.speedUp();		//SportCar의 멤버가 보인다.
		
		//sportCar = policeCar;		//서로 관련 없는 클래스들간 형변환은 이루어질 수 없음
		//sportCar = (Car)policeCar;
		
		

	}

}
