package kr.co.ezenac.array;

public class MyArrayListTest {

	public static void main(String[] args) {

		MyArrayList mArrayList = new MyArrayList();
		mArrayList.addElement(10);
		mArrayList.addElement(20);
		mArrayList.addElement(30);
//		mArrayList.printAll();
		
		mArrayList.insertElement(1, 50);
		mArrayList.printAll();
		System.out.println(mArrayList.count);
		
//		mArrayList.add/	
		
	}

}
