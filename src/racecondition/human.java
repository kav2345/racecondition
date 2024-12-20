package racecondition;

public class human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"has entered bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is using bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"finished using bathroom");
			Thread.sleep(3000);
		   }
		catch(InterruptedException e) {
			e.printStackTrace();	
		}
   }
}