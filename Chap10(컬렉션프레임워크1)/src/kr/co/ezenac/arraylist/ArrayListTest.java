package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//기본적으로 초기용량(capacity)이 10개 생성됨.
		ArrayList list = new ArrayList();
		
		//저장된 객체의 크기
		System.out.println("총 크기 : " + list.size() );
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println("총 크기 : " + list.size() );
		
		list.add(3);			// list.add(new Integer(3));
		System.out.println("총 크기 : " + list.size() );
		
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//0번째 인덱스에 "333" 추가
		list.add(0, "3");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//객체 삭제하기
		//앞에서부터 검색해서 "333"을 삭제함 (가까운 것 한개만 삭제).
		list.remove("3");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//객체 전부 삭제하기
		list.clear();
		System.out.println("ArrayList에 있는 값 : " + list.toString());
	}

}






