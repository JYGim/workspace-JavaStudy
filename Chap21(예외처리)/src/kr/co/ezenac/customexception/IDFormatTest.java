package kr.co.ezenac.customexception;

public class IDFormatTest {

	private String userID;	
		
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("ID가 null일 수 없습니다. ");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID를 8자 이상 20자 이하로 쓰세요");
		}
			
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myID = null;
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			//System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		myID = "ezenac";
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		

	}

}





























