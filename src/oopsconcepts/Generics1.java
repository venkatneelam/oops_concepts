package oopsconcepts;

import java.util.ArrayList;


public class Generics1 {

	public static void main(String[] args) {
		
		// without generic
		
/*	ArrayList list=new ArrayList();
	
	    list.add(10);
	      
	    System.out.println("list is:"+list); */
	 
	    // with generic
	      
	      ArrayList <Integer> list =new ArrayList<Integer>();
	      
	      list.add(10);
	      list.add(12);
	      list.add(15);
	      
	     // list.add("15");
	      
	      System.out.println("printing the list:"+list);
	      
		
	}

}
