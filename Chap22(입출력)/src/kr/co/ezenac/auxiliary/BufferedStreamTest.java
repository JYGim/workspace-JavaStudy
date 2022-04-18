package kr.co.ezenac.auxiliary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		
		long start = 0L;
		long end = 0L;
		
		try(FileInputStream fis = new FileInputStream("mybatis-3.5.9.zip");
			FileOutputStream fos = new FileOutputStream("copy2.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			start = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			end = System.currentTimeMillis();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		long time = (long)(end -start);
		System.out.println(time);
		System.out.println("파일 복사 소요 시간2: " + (long)(time/1000) + "초");
		
	}
	
}
