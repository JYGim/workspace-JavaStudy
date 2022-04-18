package kr.co.ezenac.auxiliary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)) {
				
			dos.write(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Ezen");
			
			} catch(IOException e) {
				e.printStackTrace();
		}
		System.out.println("출력을 완료하였습니다. ");
		
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)) {
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
