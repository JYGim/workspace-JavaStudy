package kr.co.ezenac.etc;

interface Unit {
	@Deprecated
	void run(String str);
	void move(String str);
}

class Horse implements Unit {
	

public class DeprecatedTest {

	public static void main(String[] args) {
		Unit unit = new Horse();
		unit.move("�̵��մϴ�.");
		unit.run("�޸��ϴ�.");
		

	}

}

public void run(String str) {
	// TODO Auto-generated method stub
	
}

public void move(String str) {
	// TODO Auto-generated method stub
	
}
