package oopsconcepts;

public class RunnableString implements Runnable {

	public void run() {
		System.out.println("runnable interface");
	}
	
	public static void main(String[] args) {
		
		// creating object to the runnablestring
		
		Runnable r1=new RunnableString();
		
		// creting a thread for runnable interface
		
		Thread t1=new Thread(r1,"my new thread");
		 
		t1.start();
		
		String str=t1.getName();
		System.out.println(str);
		
	}

}
