package racecondition;

class Queue {
	int data;
	public void put(int i) {
		data=i;
		System.out.println("data added...the datavalue is:"+i);
	}
	public void get(int i) {
		data=i;
		System.out.println("data retrived>>>the data value is"+i);
	}
}
class producer extends Thread{
	Queue a;
	public producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.put(i);
			i++;
		}
	}
}
class consumer extends Thread{
	Queue b;
	public consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			b.get(i);
			i++;
		}
	}
}
public class test{
	public static void main(String args[]) {
		Queue q=new Queue();
		(new producer(q)).start();
		(new consumer(q)).start();
		
	}
}