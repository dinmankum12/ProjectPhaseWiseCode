
public class SleepAndWait extends Thread {

	public static void main(String[] args) {
		SleepAndWait timer = new SleepAndWait();
		timer.setName("clock");
		timer.start();
		
	}
		public void run() {
			System.out.println(Thread.currentThread().getName()+" About time");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("some");
			}
			int i=0;
			while(i<5) {
				i++;
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					
				}
				Object timer = i;
				synchronized (timer)
			    {
			        try {
						timer.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        System.out.print(i+"\r");
			        System.out.println("Object '" + timer+ "' is woken after" +
			          " waiting for 1 second");
				
			}
			
		}}
	
}
//synchronized(monitor){
//    while(condition == true)
//    {
//        monitor.wait()  //releases monitor lock
//    }
// 
//    Thread.sleep(100); //puts current thread on Sleep   
//}
