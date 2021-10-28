package oopsconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic3 {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
			
		al.add("venkat");
		al.add("revathi");
		
		String s=al.get(1);
		
		System.out.println("element is:"+s);
			
		
		  Iterator<String>itr=al.iterator();
		  
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		

	}

}
