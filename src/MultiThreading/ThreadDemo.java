package MultiThreading;

public class ThreadDemo extends Thread {
	
	public ThreadDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running!!"+Thread.currentThread().getName()+"Priority: "+Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo("First Thread");
		ThreadDemo t2 = new ThreadDemo("Second Thread");
		ThreadDemo t3 = new ThreadDemo("Third Thread");
		
		t1.start();
		t3.start();
		t2.start();

	}

}
