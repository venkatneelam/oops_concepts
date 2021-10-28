package oopsconcepts;

class parametr{
	//Properties
	
	
	double height;
	double depth;
	double width;
	
	// Method (behavior)
	double volume() {
		return width*height*depth;
	}
	// method
	public void setDim(double d,double h,double w) {
		width=d;
		height=h;
		depth=w;
	
	}
	
	
}

public class oopsParameterziedMethod {

	public static void main(String[] args) {
		
	box mybox1=new box();
	box mybox2=new box();
	
	double vol;
	
    mybox1.setDim(10,34,56);
    mybox2.setDim(23,32,34);
    
    vol=mybox1.volume();
    System.out.println("volume is"+vol);
    
    vol=mybox2.volume();    
    System.out.println("volume is"+vol);
    
    
    
	
	

	}

}
