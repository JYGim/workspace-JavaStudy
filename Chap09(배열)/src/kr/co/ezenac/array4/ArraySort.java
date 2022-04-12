package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*45) + 1;
		}
		
		System.out.println("정렬 전");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
		//1차원 배열이더라도 더블 루프가 필요하고 조건문이 하나 필요함
//		for(int i=0; i<ball.length; i++) {
//			for(int j=0; j<ball.length-1; j++) {
//				//버블정렬
//				if(ball[j] > ball[j+1]) {
//					int temp = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = temp;
//				}
//			}
//		}
		Arrays.sort(ball);
		
		System.out.println("정렬 후");
//		for(int i=0; i<ball.length; i++) {
//			System.out.print(ball[i] + " ");
//		}		
		
		System.out.println(Arrays.toString(ball));
		
	}

}







