package com.presentation.capg;

public class ThreadRun implements Runnable  {
	public void run () {
		System.out.println("Creating thread using Runnable method "+Thread.currentThread().getPriority());
	}

}

