package racecondition;

public class start {

	public static void main(String[] args) throws InterruptedException{
		human h1=new human();
		human h2=new human();
		human h3=new human();
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		Thread t3=new Thread(h3);
		t1.setName("boy");
		t2.setName("girl");
	    t3.setName("other");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
		//t3.join();
		

	}

}
