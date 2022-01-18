
	class ThreadOne extends Thread
		{
	//Override run method of thread class in subclass and write the business logics that has to be executed concurrently.
	@Override
		public void run() {
			System.out.println("executing task one ");
			}
		}
		class ThreadTwo extends Thread
		{
	@Override
		public void run() {
			System.out.println("executing task two ");
		}
	}
	public class ThreadDemo {

	public static void main(String[] args) { 
		System.out.println("Program starts");

	// create the object of subclass and using the subclass object call Start method.
		ThreadOne t1 = new ThreadOne(); 
		ThreadTwo t2 = new ThreadTwo();
		t1.start(); // start method internally call run method and execute business logic t2.start();
		t2.start();
	System.out.println("Program end");
		}
	}
