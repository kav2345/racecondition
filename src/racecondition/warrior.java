package racecondition;

public class warrior extends Thread{
	String res1="ak47";
	String res2="m416";
	String res3="awm";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("student1")){
			Student1Acq();
		}
		else {
			Student2Acq();
		}
	}
	public void Student1Acq() {
		try {
			synchronized(res1) {
				System.out.println("Student1 acquired the resource:"+res1);
				Thread.sleep(2000);
			synchronized(res2) {
				System.out.println("Student1 acquired the resource:"+res2);
				Thread.sleep(2000);
			synchronized(res3) {
				System.out.println("Student1 acquired the resource:"+res3);
				Thread.sleep(2000);
			}
			} 
		    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Student2Acq() {
		try {
			synchronized(res3) {
				System.out.println("Student2 acquired the resource:"+res3);
				Thread.sleep(2000);
			synchronized(res2) {
				System.out.println("Student2 acquired the resource:"+res2);
				Thread.sleep(2000);
			synchronized(res1) {
				System.out.println("Student2 acquired the resource:"+res1);
				Thread.sleep(2000);
			}
			} 
		    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
		

