package kr.co.ezenac.linkedlist;

public class MyLikedList {
	
	private MyListNode head;
	int count;
	
	public MyLikedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		if(head == null) {								//맨 처음일 때 
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) {					//맨 뒤로 가서 
				temp = temp.next;
			}
			temp.next = newNode;
			head = newNode;
		}
		count++;
		
		return newNode;
	}
	
	//중간에 노드가 추가되는 경우
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);					//추가할 노드
		
		if(position<0 || position>count) {
			System.out.println("");
		}
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다. ");
			return;
		}
		
		MyListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next();
			if(temp!=null) {
				System.out.println("->");
			}
		}
		System.out.println("");
		
	}
	
	

}
