package kr.co.ezenac.polymorphism3;

public class Parent {
	int x = 100;
	
	public void method() {
		System.out.println("조상메서드 호출");
	}
	
	/*
	 * 매개변수의 타입이 Object라는 것은
	 * => 모든 클래스를 다 받을 수 있다는 것임.
	 */
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;		//강제 캐스팅(다운 캐스팅)
			System.out.println("조상클래스의 멤버 x값: " + parent.x);
		}
		else {
			System.out.println("Parent타입의 객체가 아님. 상속관계에 있지 않은 클래스임");
		}
	}
}
