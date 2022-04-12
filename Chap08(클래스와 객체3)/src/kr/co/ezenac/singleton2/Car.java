package kr.co.ezenac.singleton2;

/*
 * 	static과 싱글톤 패턴을 적용해서 구현하시오.
 * 		- 자동차 공장이 있습니다.
 * 		  자동차 공장이 유일한 객체입니다.
 *        이 공장에서 생산되는 자동차는 제작할때마다 고유의 번호가 부여됩니다.
 *        자동차 번호가 10001부터 시작되어 자동차가 생산 할때 마다 10002, 10003 이렇게 번호가 붙는다.
 *      - 자동차 클래스, 자동차 공장 클래스를 구현하시오.
 *        
 */
public class Car {
	public static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
	
	
}



















