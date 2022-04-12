package kr.co.ezenac.lambda2;

/*
 *  람다식 문법
 *  
 *  	선언부			구현부
 *  ------------	----------------
 *  (타입 매개변수명) -> {실행문; 실행문;...}
 *  
 */


public class LambdaTest {
	
	public static void main(String[] args) {
		MyInterface myInterface = null;
		myInterface = (x) -> {
			int result = x * 10;
			System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 갑: " + result);
		};
		
		myInterface.method(500);
		
		myInterface = x -> System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 갑: " + x * 10);
		myInterface.method(500);
		
	}
}
