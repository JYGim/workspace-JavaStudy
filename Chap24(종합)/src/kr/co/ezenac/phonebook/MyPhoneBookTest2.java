package kr.co.ezenac.phonebook;

import java.util.Scanner;

public class MyPhoneBookTest2 {
	
	Scanner scanner = new Scanner(System.in);
	int i = Scanner.nextInt();

	public static void main(String[] args) {
		
		int choice;
		while (true) {
			showMenu();
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				addNumber();
				break;
			}
			case 2: {
				findNumber();
				break;
			}
			case 3: {
				delNumber();
				break;
			}
			case 4: {
				System.out.println("종료합니다. ");
				stop();
				break;
			}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요: ");
				break;
			}
			
		}	
			

	}
	
	public static void showPhoneBook() {
		Set<String> 
	}
	
	
	
	
	

}
