package kr.co.ezenac.etc;

public class VarArgsTest {

	public static void helloEzen(String...vargs) {				//�����μ� ǥ��
		for(String str:vargs) {
			System.out.println(str + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		helloEzen("�̼���");
		helloEzen("�̵�", "�̹��");
		helloEzen("�̵�", "�̹��", "�̼���");

	}

}
