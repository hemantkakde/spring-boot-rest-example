package com.presentation.capg;

public class MyThread  extends Thread {

	public void run() {
		for (int i=1;i<5;i++)
		{
		
		System.out.println("Thread is created using extends method ");
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {}

}
}
}

 
	 