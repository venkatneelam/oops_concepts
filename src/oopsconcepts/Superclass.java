package oopsconcepts;

class Animal{
	
	
	public void animalsound() {
		System.out.println("animal makes sound");
		
	}
}

class dog extends Animal{
	public void animalsound() {
		super.animalsound();
		System.out.println("dog says bow bow");
	}

	
}
public class Superclass {

	public static void main(String[] args) {
		dog obj=new dog();
		obj.animalsound();
			
	}

}
