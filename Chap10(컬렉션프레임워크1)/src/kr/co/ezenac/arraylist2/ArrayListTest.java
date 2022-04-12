package kr.co.ezenac.arraylist2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> bookstore = new ArrayList<>();
		
		bookstore.add(new Book("도커, 쿠버네티스, 테라폼으로 구현하는 마이크로서비스", "애슐리 데이비스"));
		bookstore.add(new Book("헬스케어 분석을 위한 머신러닝", "에듀오닉스 러닝 솔루션스"));
		bookstore.add(new Book("헬스케어 분석을 위한 머신러닝2", "에듀오닉스 러닝 솔루션스2"));
		bookstore.add(new Book("헬스케어 분석을 위한 머신러닝3", "에듀오닉스 러닝 솔루션스3"));
		bookstore.add(new Book("헬스케어 분석을 위한 머신러닝4", "에듀오닉스 러닝 솔루션스4"));

		for(int i=0; i<bookstore.size(); i++) {
			bookstore.get(i).showInfo();
		}
	}

}
