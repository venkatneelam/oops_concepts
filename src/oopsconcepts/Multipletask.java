package oopsconcepts;

public class Multipletask extends Thread {
	
	    public void run() {
	    	
	    	System.out.println("running");
	    }

	public static void main(String[] args) {
		
		Multipletask t1=new Multipletask();
		Multipletask t2=new Multipletask();
		Multipletask t3=new Multipletask();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
