package com.vk.quasys;

public class ThreadDemoTwoAsAnnonymousClass {

	public static void main(String[] args) {
		
		//THIS ALSO WOULD WORK. IMPLEMENTATION AS ANONYMOUS CLASS
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i<5; i++) {
//					System.out.println("The child thread");
//				}
//			}
//	     };
		
		Runnable r = () -> {
			for(int i=0; i< 5; i++) {
				System.out.println("Helllo child thread");
			}
		};
	    
	     Thread t = new Thread(r);
	     t.start();

    }
}
