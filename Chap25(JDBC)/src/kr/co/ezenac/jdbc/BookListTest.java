package kr.co.ezenac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookListTest {
	
	Connection conn;
	
	String bookID;
	
	public BookListTest() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ezen";
		String password = "0824";
		
		try {		// 드라이버 찾는 과정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비...");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		BookListTest bookListTest = new BookListTest();
		bookListTest.sqlRun();
		
		
		
	}

	public void sqlRun() {
		// sql문
		String query = "select * from Book";
		try {
			// 인파라미터가 없는 정적 쿼리문을 실행할 때 사용됨
			// PreparedStatement - 파라미터가 있는 동적 쿼리문을 실행할 때 사용됨
			Statement stmt = conn.createStatement();
			
			//select 쿼리문의 결과를 저장할 때 사용
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Book No\tBook Name\t\tPublisher\tPrice\t");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.print("\t" + rs.getInt(4) + "\n");
			}
			
			conn.close();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
}
