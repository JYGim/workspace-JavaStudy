package kr.co.ezenac.innerclass;

public class OutClass {
	private int num = 18;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();						//내부 클래스 생성
	}
	
	class InClass {
		int inNum = 100;
//		static int sInNum = 200;						//에러 발생
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}
		
//		static void sTest() {}							//에러 발생
	}
	
	public void usingInClass() {
		inClass.inTest();								//내부 클래스 참조 변수를 사용하여 메서드 호출
		
	}
	
	

public static class InnerTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
		outClass.usingInClass(); 						//내부 클래스 기능 호출
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass();		//외부 클래스를 이용하여 내부클래스 생성
		System.out.println("외부 클래스를 이용하여 내부 클래스 생성");
		inClass.inTest();
		
		
		
		
	}
}

}
