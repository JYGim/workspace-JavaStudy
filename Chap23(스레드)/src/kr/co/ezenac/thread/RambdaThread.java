package kr.co.ezenac.thread;

public class RambdaThread {

	public static void main(String[] args) {
		
		Runnable task = () -> {							//Runnabe 참조 변수에 람다식을 대입
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				int sum = 0;
				for(int i=0;i<10;i++) {
					sum += i;		
				}
				/*
				 * 	스레드명: 일련번호가 붙여진 이름이 반환됨
//				 */
				String name = Thread.currentThread().getName();
				System.out.println(name + ", " + sum);	
			};
		
		
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("main 메서드의 스레드 이름: " + Thread.currentThread().getName());
		}
		
	

}
