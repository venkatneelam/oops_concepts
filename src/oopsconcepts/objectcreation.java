package oopsconcepts;


	class venkat{
		// Attributes
		double width;
		double height;
		double depth;
		
		// method
		void volume() {
			System.out.println("volume is");
			System.out.println(width*height*depth);
			
		}
		
		
	}
	public class objectcreation {
	public static void main(String[] args) {
		venkat ob1=new venkat();
		venkat ob2=new venkat();
		
		ob1.width=20;
		ob1.height=30;
		ob1.depth=40;
		
		ob2.width=30;
		ob2.height=25;
		ob2.depth=23;
		
	     ob1.volume();
	     ob2.volume();
		
		
	

	}

}
