package MultiThreading;

public class MyThread implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is Running......");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1= new Thread(mt, "Java Thread "); //new state
		t1.start();

	}

}
