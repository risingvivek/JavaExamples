package com.vk.quasys;

public class ThreadExampleOne {

	public static void main(String[] args) {
		

	}

}

class ThreadDemo extends Thread {
	
	private Thread t;
	private String threadName;
	PrintDemo demo;
	
	ThreadDemo (String name, PrintDemo pd) {
		threadName = name;
		demo = pd;
	}
	
	public void running() {
		demo.printCount();
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start() {
		
	}
	
}

class PrintDemo {
	
	public void printCount() {
		
		try {
			for (int i = 5; i>0; i--) {
				System.out.println("Counter --- "+i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class nextThread extends Thread {
	
}