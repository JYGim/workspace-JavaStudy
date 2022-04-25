package kr.co.ezenac.phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBookTest {
	
	static String name;
	static String phoneNumber;
	static String email;
	static MyPhoneBook mPhoneBook;
	
	
	static Scanner scanner = new Scanner(System.in);	
	static boolean indicator = true;
	
	
	static Map<String, MyPhoneBook> map = new HashMap<String, MyPhoneBook>();
	
	
	
	public static void main(String[] args) {
		
		int choice;
		while (indicator) {
			showMenu();
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				addNumber();				
				break;
			}
			case 2: {
				showPhoneBookList();
				break;
			}
			case 3: {
				addNumber();
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
	
	
	
	



	public static void showMenu() {
		System.out.println("[메뉴 선택]");
		System.out.println("1. 전화번호 저장");
		System.out.println("2. 전화번호 조회");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 종료");
		System.out.println("선택: ");
	}
	
	public static void addNumber() {
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("전화번호: ");
		phoneNumber = scanner.next();
		scanner.nextLine();
		System.out.println("이메일: ");
		email = scanner.nextLine();
		System.out.println(email + "야호");
		
		
		
		
		if(email != null) {			
			mPhoneBook = new MyPhoneBook(name, phoneNumber, email);	
			System.out.println("null값인가요? " + (email == null));
		}
		else {
			System.out.println("널값이에요!!");
		}
//		else if(email.equals("")){
//			
//			mPhoneBook = new MyPhoneBook(name, phoneNumber);
//			System.out.println("=================================");
//			
//		}
		mPhoneBook.showInfo();
		map.put(name, mPhoneBook);
		
		
	}
	
	public static void showPhoneBookList() {
		
		for(Entry<String, MyPhoneBook> entry : map.entrySet()) {
			
			System.out.println("이름: " + entry.getKey());
			System.out.println("전화번호: " + entry.getValue().phoneNumber);
			System.out.println("이메일: " + entry.getValue().email);
			System.out.println("---------------------------------------------------------------------------");
			
		}
		
		
		
		
		
	}
	
	
	
	
	private static void stop() {
		indicator = false;
		
	}
	
}
