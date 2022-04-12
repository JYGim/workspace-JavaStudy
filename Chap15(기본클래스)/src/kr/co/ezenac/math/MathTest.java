package kr.co.ezenac.math;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("4ÀÇ Á¦°ö±Ù: " + Math.sqrt(4));
		System.out.println("log2(8): " + (Math.log(8)) / Math.log(2));
		System.out.println("2ÀÇ 3½Â: " + Math.pow(2, 3));
		
		System.out.println();
		
		System.out.println("½ÎÀÎ 45: " + Math.sin(Math.toRadians(45)));
		System.out.println("ÄÚ½ÎÀÎ 45: " + Math.cos(Math.toRadians(45)));
		System.out.println("ÅºÁ¨Æ® 45: " + Math.tan(Math.toRadians(45.0)));

	}

}
