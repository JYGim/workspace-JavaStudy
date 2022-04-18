package kr.co.ezenac.multithread;

public class MultiThreadTest {

	public static void main(String[] args) {
		
 		Runnable task1 = () -> {
			//	20 미만 짝수 출력
			for(int i=0;i<20;i=i+2) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable task2 = () -> {
			//	10 미만의 수 출력
			for(int i=9;i>0;i--) {
				System.out.print("(" + i + ")");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
	}
	
}
