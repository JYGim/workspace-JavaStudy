package kr.co.ezenac;

import java.util.Scanner;

public class GradeSystem {	
		
	static String studentID;
	static String studentName;
	static String[][] student = new String[2][5];	
	static double total;	
	static boolean flag = true;	
	
	static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		for (int i=0;i<student.length;i++) {
			for (int j=0;j<student[i].length;j++) {
				student[i][j]="";
			}
		}
		int choice;	
		
		while(flag) {
			showMenu();
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				add();				
				break;
			}
			case 2: {
				show();
				break;
			}
			case 3: {
				end();
				break;
			}			
			default:
				System.out.println("");
				break;
			}
		}
	}
	
	// 입력 메서드
	private static void add() {
		if(student[1][0] != "") {
			System.out.println("더 이상 입력하실 수 없습니다.");
			System.out.println();
			return;
		}
		
		int index = 0;
		for (int i=0;i<student.length;i++) {
			if (student[i][0].equals("")) {
				index = i;
				break;
			}
		}		

//		System.out.print("번호: ");
//		studentID = scanner.next();
		boolean chDigit = true;
		while(chDigit) {
			System.out.print("번호: ");
			studentID = scanner.next();	
			
			chDigit = checkDigit(studentID);			
		}
		
		System.out.print("이름: ");
		String studentName = scanner.next();
		
	// 점수가 음수이거나 100점을 넘지 않도록 체크
		boolean chNo = true;
		while(chNo) {
			System.out.print("국어 : ");
			String korean = scanner.next();	
			student[index][2] = korean;
			chNo = checkNum(korean);			
		}
		
		chNo = true;
		while(chNo) {
			System.out.print("영어 : ");
			String english = scanner.next();
			student[index][3] = english;
			chNo = checkNum(english);
		}
		
		chNo = true;
		while(chNo) {
			System.out.print("수학 : ");
			String math = scanner.next();
			student[index][4] = math;
			chNo = checkNum(math);
		}		
		
		
		student[index][0] = studentID;
		student[index][1] = studentName;	
				
		System.out.println();
	}
	
	private static boolean checkDigit(String studentID) {
		boolean integerOrNot = studentID.matches("-?\\d+");
		
		if(integerOrNot != true) {
			System.out.println("잘못입력하셨습니다.");
			return true;
		}
		return false;			
	}

	// 점수 체크 메서드
	private static boolean checkNum(String str) {
		int intNo = Integer.parseInt(str);
		if(intNo<0 | intNo>100) {
			System.out.println("잘못입력하셨습니다.");
			return true;
		}
		return false;		
	}

	//종료 메서드
	private static void end() {
		System.out.println("사용해 주셔서 감사합니다. ");
		flag = false;
	}

	//출력 메서드
	private static void show() {		
		System.out.println("------------");
		for(int i=0;i<student.length;i++) {			
			if (!student[i][0].equals("")) {
				int kor;
				int eng;
				int math;
				System.out.println("-----" + student[i][0] + "번 학생의 정보-----");
				System.out.print("번호: " + student[i][0] + "번\t이름: " + student[i][1] + "\n" );
				System.out.print("국어: " + student[i][2] + "점\t" +
								 "영어: " + student[i][3] + "점\t" +
								 "수학: " + student[i][4] + "점\n");
				kor = Integer.parseInt(student[i][2]);
				eng = Integer.parseInt(student[i][3]);
				math = Integer.parseInt(student[i][4]);
				total = kor + eng + math;
				System.out.printf("총점: %.1f점\t평균: %.2f점\n", total, total/3);
				System.out.println();
			}
			else if(student[0][0].equals("")){
				System.out.println("아직 입력된 정보가 없습니다. ");
				break;
			}
			}		
//			flag = false;
	}
	
	//메뉴 보여주기 메서드
	public static void showMenu() {		
		System.out.println("1.입력	2.출력	3.종료");	
		System.out.print("> ");
	}
	
}
