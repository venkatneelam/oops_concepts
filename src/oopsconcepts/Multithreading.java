package oopsconcepts;

class printer{
	void printDocument(int numOfCopies,String Documents) {
	    for(int i=1;i<=numOfCopies;i++) {
	    	System.out.println("printing document :"+Documents+" "+i);
	    }
	}
}

public class Multithreading {

	public static void main(String[] args) {
		
		System.out.println("Starting of the application");
		
		printer printer1=new printer();
		printer1.printDocument(10, "venkatdocument");
		
		
		System.out.println("ending of the application");
		

	}

}
