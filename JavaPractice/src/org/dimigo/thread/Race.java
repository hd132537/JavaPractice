package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().toString() + " method start");
		
		Thread runner1 = new Runner("홍길동");
		Thread runner2 = new Runner("홍길순");
		
		runner1.start();
		runner2.start();

		System.out.println(Thread.currentThread().toString() + " method end");

	}
}
