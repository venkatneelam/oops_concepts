package oopsconcepts;

public class Priority extends Thread {
	
	public void run() {
		System.out.println("running threadname is:"+Thread.currentThread().getName());
		
		System.out.println("running threadname 2 is:"+Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
		Priority p1=new Priority();
		Priority p2=new Priority();
		
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		
		p1.start();
		p2.start();
	
			
		
	}

}
