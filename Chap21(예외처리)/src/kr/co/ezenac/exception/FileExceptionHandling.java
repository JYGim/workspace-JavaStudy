package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("ezen.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("예외: " + e);
//			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("예외: " + e);
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다. ");
			
		}
		System.out.println("여기도 수행됩니다. ");
	}

}
