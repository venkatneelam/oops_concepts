package oopsconcepts;

class box {
	
	// Declaration of properties and behavior
	
	int width;
	int height;
	int depth;
	
	
	}
	
	

public class Inheritance {

	public static void main(String[] args) {
		
     box mybox=new box();
     int vol;
     mybox.width=10;
     mybox.height=20;
     mybox.depth=30;
     vol=mybox.width * mybox.height* mybox.depth;
     System.out.println("volume is:"+vol);
	}

}
