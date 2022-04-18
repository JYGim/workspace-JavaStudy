package kr.co.ezenac.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {

	public static void main(String[] args) {
		
		
		Runnable task1 = () -> {		// 스레드에서 시킬 작업(10000번 동안 더하기함)
			
			String name = Thread.currentThread().getName();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name + " 바로 실행");
		};
		
		Runnable task2 = () -> {		// 스레드에서 시킬 작업(10000번 동안 빼기함)
			
			String name = Thread.currentThread().getName();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name + " 2초 후 실행");
		};
		
		Runnable task3 = () -> {		// 스레드에서 시킬 작업(10000번 동안 빼기함)
			
			String name = Thread.currentThread().getName();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name + " 5초 후 실행");
		};
		
		// 스레드 풀에서 수행할 수 있는 스레드의 총량을 제한
		// 현재 스레드풀은 동시에  전달 받아 처리할 수 있음
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		
		// 
		//
		pool.submit(task1);			
		pool.submit(task2);			
		pool.submit(task3);			
		
		System.out.println("End: " + Thread.currentThread().getName());
		
		//	마지막 스레드가 종료되면 스레드풀을 종료시킴
		pool.isShutdown();
		
		
		
		
		
		
		
		
		
	}
	
}
