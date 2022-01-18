
public class RunnableDemo {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		
		Thread theThread = new Thread(task);
		Thread theThread1 = new Thread(task);
		Thread theThread2 = new Thread(task);
		Thread theThread3 = new Thread(task);

		
		theThread.setName("Devadharshini");
		theThread1.setName("Dinesh");
		theThread2.setName("Kumar");
		theThread3.setName("Mandal");
		
		theThread.start();
		theThread1.start();
		theThread2.start();
		theThread3.start();
		
		//new Thread(new MyTask()).start();
		
		

	}

}

class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running...");	
		//System.out.println(Thread.currentThread().getName() + " running...");	
	}
}