package kr.co.ezenac.innerclass2;

public class OutClass {
	private int num = 18;
	private static int sNum = 20;
	
	public OutClass() {
		
	}
	
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {					//정적 클래스의 일반 메서드
//			num += 10;					//내부 정적 클래스에서 외부 일반 클래스의 인스턴스 변수는 사용 불가
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스테이틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스테이틱 변수 사용)");
			
		}
		
		static void sTest() {			//정적 클래스의 static 메서드
//			num += 10;					//외부 클래스의 인스턴스 변수는 사용 불가
//			inNum += 10;				//내부 클래스의 인스턴스 변수는 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스테이틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스테이틱 변수 사용)");
		}
		
	}
	
	
	
	

public static class InnerTest {
	
	public static void main(String[] args) {
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스의 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스테틱 메서드 호출");
		
		
		
	}
	
}

}
