package oopsconcepts;

public class Multi1 implements Runnable {
     
	public void run() {
		System.out.println("Runnable interface");
	}
	
	public static void main(String[] args) {
		
		Multi1 m2=new Multi1();
		Thread t1=new Thread(m2);
		t1.start();


	
}
}