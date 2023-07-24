package com.Rajesh;

import java.util.Date;

class Myclock {

	public static void main(String[] args) 
	{
		System.out.println("adsadasdasd");
		for(int i=0;i<60;i++)
		{
		Runnable r1 = new Runnable() {
			public void run() {
			Thread t = Thread.currentThread();
			//Date d = new Date();
			System.out.println();
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}	
		
		};
		r1.run();
		System.out.println(i);
		
			}}
}