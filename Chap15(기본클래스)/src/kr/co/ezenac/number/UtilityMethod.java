package kr.co.ezenac.number;

public class UtilityMethod {

	public static void main(String[] args) {
		
		Integer num1 = Integer.valueOf(5);
		Integer num2 = Integer.valueOf("0824");
		
		System.out.println("ū ��: " + Integer.max(num1, num2));
		System.out.println("���� ��: " + Integer.min(num1, num2));
		System.out.println("��: " + Integer.sum(num1, num2));
		System.out.println(num1.getClass().getName());
		System.out.println(num1.getClass());
		System.out.println();
		
		System.out.println("12�� 2�� ǥ��: 0B" + Integer.toBinaryString(12));
		System.out.println("12�� 8�� ǥ��: 0" + Integer.toOctalString(12));
		System.out.println("12�� 16�� ǥ��: 0x" + Integer.toHexString (12));

	}

}
