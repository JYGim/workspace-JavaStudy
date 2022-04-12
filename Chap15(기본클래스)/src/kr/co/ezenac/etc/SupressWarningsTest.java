package kr.co.ezenac.etc;

interface Unit2 {
	@Deprecated
	@SuppressWarnings("deprecated")
	void run(String str);
	void move(String str);
}

class Horse2 implements Unit2 {
	
	
}

public class SupressWarningsTest {
	@SuppressWarnings("deprecated")
	public static void main(String[] args) {
		Unit2 unit = new Horse2();
		unit.move("�̵��մϴ�.");
		unit.run("�޸��ϴ�.");
		

	}

}
