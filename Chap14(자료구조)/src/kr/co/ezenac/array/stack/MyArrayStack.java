package kr.co.ezenac.array.stack;

import kr.co.ezenac.array.MyArrayList;

public class MyArrayStack {
	
	int top;
	MyArrayList arrayList;
	
	public MyArrayStack() {
		top = 0;
		arrayList = new MyArrayList(size);
		
	}
	
	public MyArrayStack(int num) {
		
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full!");
			return;
		}
		arrayList.addElement(data);
		
	}
	
	public boolean isFull() {
		if(top == arrayList.ARRAY_SIZE) {
			return true;
		}
		else
			return false;
	}
	
	public void printAll() {
		arrayList.printAll();
	}

}
