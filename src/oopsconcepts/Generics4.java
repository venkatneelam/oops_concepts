package oopsconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Set;

public class Generics4 {

	public static void main(String[] args) {
		
		HashMap h1=new HashMap();
		
		h1.put(150626, "venkat");
		
		h1.put(150439, "revathi");
		
		h1.put(150617, "ajay");
		
		
		System.out.println("geting data:"+h1);
		
	       Set s =  h1.keySet();	
//	         
//	       System.out.println(s);
//	       
//	       Collections.sort(s);
	       ArrayList al = new ArrayList();
	       //System.out.println(al);
	       al.addAll(s);
	     //System.out.println(al);
	     
	      Collections.sort(al);
	          System.out.println(al);
	          
	          ArrayList a2=new ArrayList();
	             a2.addAll(h1.values());
	             
	                System.out.println(a2);
	                
	                 Collections.sort(a2);
	                     
	                   System.out.println(a2);
	         
	}

}
