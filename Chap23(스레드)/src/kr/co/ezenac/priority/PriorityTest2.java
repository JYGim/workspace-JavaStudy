package kr.co.ezenac.priority;

class PriorityThread2 extends Thread {
	
	@Override
	public void run() {
		super.run();
		int sum = 0;
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		
		for(int i=0;i<=1000000;i++) {
			sum += i;
		}
		
		System.out.println(thread.getPriority() + " 우선 순위 스레드 end");
		
	}
}

public class PriorityTest2 {

	public static void main(String[] args) {
		
		PriorityThread priorityThread1 = new PriorityThread();
		PriorityThread priorityThread2 = new PriorityThread();
		PriorityThread priorityThread3 = new PriorityThread();
		
		priorityThread1.setPriority(Thread.MIN_PRIORITY);
		priorityThread2.setPriority(Thread.NORM_PRIORITY);
		priorityThread3.setPriority(Thread.MAX_PRIORITY);
		
		priorityThread1.start();
		priorityThread2.start();
		priorityThread3.start();
		
	}
	
}
