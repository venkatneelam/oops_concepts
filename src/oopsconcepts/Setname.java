package oopsconcepts;

public class Setname extends Thread {

   public void run() {
	   System.out.println("running");
   }
	public static void main(String[] args) {
		
		Setname t1=new Setname();
		Setname t2=new Setname();
		
		System.out.println("name of the firast person :"+t1.getName());
		
		System.out.println("name of the second person :"+t2.getName());
		
		System.out.println("id of the person :"+t1.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("venkat");
		
		System.out.println("After changing the name:"+t1.getName());
		
	}

}
