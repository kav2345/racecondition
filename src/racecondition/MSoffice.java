package racecondition;

public class MSoffice extends Thread{
	public void typing() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("typing");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();	
		}
	}
	public void spellcheck() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("spellcheck");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				e.printStackTrace();	
			}
	}
	public void saving() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("saving");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				e.printStackTrace();	
			}
		}
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
		     typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();		
		}
		else {
			saving();
		}
	}
}