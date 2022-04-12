package kr.co.ezenac.operator2;

import java.util.Scanner;

/*
 * 입력 받은 두 수중에서 큰수를 출력하시오.
 * 
 * 입력1 : 23
 * 입력2 : 56
 * 56
 * 
 */
public class ConditionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max;
		
		System.out.println("입력 받은 두 수중에서 큰수를 출력하시오.");
		System.out.print("입력1 : ");
		int x = scan.nextInt();
		
		System.out.print("입력2 : ");
		int y = scan.nextInt();	
		
		max = (x > y) ? x : y;
		System.out.println(max);
		
		scan.close();
	}

}









