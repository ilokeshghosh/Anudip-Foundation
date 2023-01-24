package MultiThreading;

public class ThreadDemoEx extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
				
				
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
				System.out.println("hi");
			}
			
			System.out.println("Thread is running!!"+Thread.currentThread().getName()+"Priority: "+Thread.currentThread().getPriority());
			
		}
		
	}
	public static void main(String[] args) {
		ThreadDemoEx t1 = new ThreadDemoEx();
		ThreadDemoEx t2 = new ThreadDemoEx();
		ThreadDemoEx t3 =new ThreadDemoEx();
		ThreadDemoEx t4 =new ThreadDemoEx();
		
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t4.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
