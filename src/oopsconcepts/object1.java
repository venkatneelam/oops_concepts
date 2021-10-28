package oopsconcepts;

//import oopsconcepts.product.Mobile;

class product{
	// Attributes
	int pid;
	String name;
	int price;
	
	// constructor
	
	product(){
		System.out.println("product object constucted");
	}
	// method (behavior)
	void setProductDetails(int pid,String name,int price) {
		this.pid=pid;
		this.name=name;
		this.price=price;
		
	}
	void showProductDetails() {
		System.out.println("--------product id :"+pid+"-------");
		System.out.println("--------product name \t"+name);
		System.out.println("--------product price\t"+price);
	}
}
	
	class mobile extends product{   
		
		mobile(){
			System.out.println("mobile object is constructed");
		}
		
		
	}
	
	
	


public class object1 {

	public static void main(String[] args) {
		
	  // object creation
		product product=new product();
		
		System.out.println("product is:"+product);
		
		product.setProductDetails(150626,"venkat",1);
		
		product.showProductDetails();
		
		product product2=new product();
		
		product2.pid=150439;
		product2.name="revathi";
		product2.price=1;
		 
		product2.showProductDetails();
		
  
		  mobile mobile= new mobile();
		//mobile venkat1=venkat.new Mobile();
		mobile.setProductDetails(150616, "iphone",80000 );
		
		mobile.showProductDetails();
		
	}

}

	
