package oopsconcepts;

import java.util.ArrayList;

public class Generic2 {

	

	public static void main(String[] args) {
	
	// without generic we have to use typecast
		
		/*ArrayList l=new ArrayList();
		
		l.add("venkat");
		  String s=(String)l.get(0);
		  
		  System.out.println("array list:"+l);
		  */
		  // with generic we doesnt have to use type casting
		  
		  ArrayList<String> l1=new ArrayList<String>();
		  
		  l1.add("venkat");
		  
		  String s=l1.get(0);
		  System.out.println("String name is"+l1);
		
	}

}
