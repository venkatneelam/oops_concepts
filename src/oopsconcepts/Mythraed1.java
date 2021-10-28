package oopsconcepts;

public class Mythraed1 {

	public static void main(String[] args) {
	  
		// create a object for thread class
		
		Thread t1=new Thread("String name");
		// start() method is used to active the thread
		
		t1.start();
		
		// geting thread name by using getname method
		
		String str=t1.getName();
		System.out.println(str)	;
		

	}

}
