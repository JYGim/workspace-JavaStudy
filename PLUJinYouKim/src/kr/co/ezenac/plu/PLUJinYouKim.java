package kr.co.ezenac.plu;

import java.util.Scanner;

public class PLUJinYouKim {			

	int result;
		
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("시작단을 입력하세요: ");
		int startDan = scan.nextInt();
		
		System.out.println("마지막단을 입력하세요: ");		
		int endDan = scan.nextInt();
		System.out.println("---------------------------------------------------");
		PLUJinYouKim plu = new PLUJinYouKim();
		plu.gugudan(startDan, endDan);		
		
		scan.close();
	}
	
	public int gugudan(int start, int end) {
		for(int i=start;i<=end;i++) {
			for(int j=1;j<10;j++) {
				result = i * j;
				System.out.println(i + " X " + j + " = " + result);				
			}
			System.out.println("---------------------------------------------------");
		}		
		return this.result;
	}
}
