package com.presentation.capg;

public class ThreadTester {
	
		 public static void main(String[] args) {
			ThreadRun tr=new ThreadRun();
			Thread t=new Thread(tr);
		
			t.start();
			
			
		System.out.println(t.isAlive());
		}
		
	}
