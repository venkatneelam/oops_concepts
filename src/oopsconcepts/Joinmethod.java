package oopsconcepts;

public class Joinmethod extends Thread {
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {System.out.println(e);
			
			//System.out.println(i); 
			
			}
		}
	}

	public static void main(String[] args) {
		
		Joinmethod t1=new Joinmethod();
		Joinmethod t2=new Joinmethod();
		Joinmethod t3=new Joinmethod();
		
		
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e){System.out.println(e);}
		
		t2.start();
		t3.start();
		

	}

}
