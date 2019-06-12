package threads;

public class MyRunnable implements Runnable {

	public static void main(String[] args)
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.run();

	}

	@Override
	public void run() {
		System.out.println(" this is runnable run");
		
	}
	
	
}
