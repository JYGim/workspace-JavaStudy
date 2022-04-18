package kr.co.ezenac.auxiliary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	
	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		try(FileInputStream fis = new FileInputStream("mybatis-3.5.9.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")) {
			
			start = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();
			
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요 시간: " + (end-start)/1000 + "초");
		
	}

}
