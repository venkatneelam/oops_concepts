package oopsconcepts;

class Mytask{
	void executeTask() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("printing document file :"+doc+ " - printer 2");
			
		}
		
	}
	
}

public class Threding {

	public static void main(String[] args) {
		
		// thread always follows the sequenciasl order
		
		// job1
		
		System.out.println("== application started==");
		
		Mytask task=new Mytask();
		task.executeTask();
				
	
		for(int doc=1;doc<=10;doc++) {
			System.out.println("document file :"+doc+ " - printer 1");
		}
		// job3
		
		System.out.println("==application ended==");
		
	}

}
