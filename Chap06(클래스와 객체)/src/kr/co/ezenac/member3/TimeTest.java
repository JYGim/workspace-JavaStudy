package kr.co.ezenac.member3;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.
		
		System.out.println(t.getHour());
		System.out.println(t);
		
		//시를 설정
		t.setHour(-22);
		System.out.println(t);
		
		t.setHour(27);
		t.setHour(11);
		System.out.println(t);
		
		t.setMinute(8);
		t.setSecond(30);
		System.out.println(t);
		
		
	}

}






