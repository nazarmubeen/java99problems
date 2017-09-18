package com.oops.concurrency;

public class MyRunnable implements Runnable{
private int id;
private Thread thread=new Thread(this);

public MyRunnable(int id)
{
	this.id=id;
}
		@Override
		public void run() {
			System.out.println("hello from"+this);
		}

	
		public void start() {
			thread.start();
		}
		@Override
		public String toString() {
			return "MyRunnable [id=" + id + ", thread=" + thread + "]";
		}

		
}

