package kr.co.ezenac.criticalsection;


class Bank {
	private int money = 10000;
	
	
	
	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m + save);
	}
	
	public synchronized void withdrawMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m - minus);
	}
	
}

class PersonA extends Thread {
	
	@Override
	public void run() {
		super.run();
		System.out.println("입금 시작");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());		
	}
}

// PersonB -- 1000원을 소비하는 스레드 작성하기
class PersonB extends Thread {
	
	@Override
	public void run() {
		super.run();
		System.out.println("인출 시작");		
		SyncMain.myBank.withdrawMoney(1000);
		System.out.println("withdrawMoney(1000): " + SyncMain.myBank.getMoney());
	}
}


public class SyncMain {

	public static Bank myBank = new Bank();
	
	
	public static void main(String[] args) throws InterruptedException {
		PersonA pA = new PersonA();
		pA.start();
		
		Thread.sleep(200);
		
		PersonB pB = new PersonB();
		pB.start();
		
		
		
	}
	
}
