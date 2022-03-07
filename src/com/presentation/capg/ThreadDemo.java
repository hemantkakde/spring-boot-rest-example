package com.presentation.capg;

public class ThreadDemo {
	 public static void main (String args []) {
		  MyThread  thrd =new MyThread();
		  thrd.start();
		  System.out.println(thrd.isAlive());
	  }

}



