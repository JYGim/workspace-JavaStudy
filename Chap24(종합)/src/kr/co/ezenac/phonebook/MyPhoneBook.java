package kr.co.ezenac.phonebook;

//	인터페이스를 추가하여 직렬화 기능에 의해 저장될 수 있음.
public class MyPhoneBook {
	
	String name;
	String phoneNumber;
	String email;
	
	public MyPhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public MyPhoneBook(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		if(email != null) {
			System.out.println("이메일: " + email);
		}
	}
	
	
}
