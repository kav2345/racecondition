package racecondition;

public class begin {

	public static void main(String[] args) throws InterruptedException{
		MSoffice m1=new MSoffice();
		MSoffice m2=new MSoffice();
		MSoffice m3=new MSoffice();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		t1.setName("typing");
		t2.setName("spellcheck");
	    t3.setName("saving");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}

}
