package kr.co.ezenac.polymorphism3;

public class ParentTest {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		System.out.println("parent.x: " + parent.x);		//자손 클래스 Child 생성자 호출로 부모 클래스 변수에 자동 타입변환하여 할당하면 부모 멤버필드 타입을 유지함.
		System.out.println("child.x: " + child.x);			//
		
		parent.method();									//멤버 필드와는 달리 자손 클래스에서 재정의한 메서드를 호출함.
		child.method();
		
		parent.type(new Child());
		parent.type(new Parent());
		parent.type(new Car());
		
		

	}

}
