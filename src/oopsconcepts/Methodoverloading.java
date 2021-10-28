package oopsconcepts;

class method{
	public void display(char a) {
		System.out.println("print the char:"+a);
	}
	
	public void display(char a,int num) {
		System.out.println(a +" "+num);
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		method obj=new method();
		obj.display('v');
		obj.display('R', 10);
		

	}

}
