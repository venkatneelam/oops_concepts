package oopsconcepts;

class product22{
	
	public void display(char a){
		
		System.out.println("product is:"+a);
	}
}

class demo extends product22{
	public void display(char a) {
		System.out.println("demo is:"+a);
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		
     product22 obj=new demo();
      obj.display('v');
	}

}
