package racecondition;

public class launch {
	public static void main(String args[]) {
		warrior w1=new warrior(); 
		warrior w2=new warrior(); 
		Thread t1=new Thread(w1);
		Thread t2=new Thread(w2);
		t1.setName("student1");
		t2.setName("student2");
		t1.start();
		t2.start();
		
	}

}
