package kr.co.ezenac.array;

public class MyArrayList {

	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	public MyArrayList() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArrayList(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];		
	}
	
	public void addElement(int num) {
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
		
	}
	
	public void insertElement(int index, int num) {
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		else if(index<0 || index>count) {
			System.out.println("insert error");
			return;
		}
		
		for(int i=count-1;i>=index;i--) {
			intArr[i+1] = intArr[i];			//하나씩 이동
		}

		intArr[index] = num;
		count++;
		
		
	}
	
	public int removeElement(int index) {
		int ret = ERROR_NUM;		
		
		if(index<0 || index>count) {
			System.out.println("remove error");
			return ret;
		}
		
		for(int i=count-1;i>=index;i--) {
			intArr[i+1] = intArr[i];			//하나씩 이동
		}

		intArr[index] = null;
		count++;
		
		
		
		return ret;
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
	
	public void printAll() {
		if(count==0) {
			System.out.println("출력할 내용이 없습니다. ");
		}
		for(int i=0;i<count;i++) {
			System.out.println(intArr[i]);
		}
	}
	
	
}
