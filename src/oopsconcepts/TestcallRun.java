package oopsconcepts;

public class TestcallRun extends Thread {
	
	public void run() {
		
		for(int i=1;i<=7;i++) {
			
		  System.out.println(i);
			  
		  }
	}

	public static void main(String[] args) {
		
		TestcallRun t1=new TestcallRun();
		TestcallRun t2=new TestcallRun();
		
		t1.run();
		t2.run();
		
	}

}
