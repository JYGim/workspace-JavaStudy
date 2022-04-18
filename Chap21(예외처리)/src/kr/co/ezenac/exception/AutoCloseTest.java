package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.util.concurrent.ExecutionException;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObject obj = new AutoCloseObject();
		
		try(AutoCloseObject obj2 = obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("에러 메시지: " + e);
//			e.printStackTrace();
		}

	}

}
