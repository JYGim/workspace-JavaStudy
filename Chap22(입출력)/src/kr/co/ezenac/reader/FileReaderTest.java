package kr.co.ezenac.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fis = new FileReader("reader.txt");
		
//		int i;
//		while((i = fis.read()) != -1) {
//			System.out.print((char)i);
//		}
//		
//		fis.close();
		
		
		try {
			while((fis.read() != -1)){
				System.out.print((char)(fis.read()));
				System.out.print(fis.read() + "*");
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	
}
