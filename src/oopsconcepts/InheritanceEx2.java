package oopsconcepts;

class person{
	// Attributes
	private int age;
	private String name;
	
	//method
	
	public void setage(int ag) {
		
		age=ag;
		
	}
	
	public void setname(String nm) {
		name=nm;
	}
	public int getage() {
		return(age);
	}
	
	public String getname() {
		return(name);
	}
}
	class Employe extends person{
		private String empID;
		
		public void setempID(String emp) {
			empID=emp;
		}
	
		public String getempID() {
			return(empID);
			
		}
	}



public class InheritanceEx2 {

	public static void main(String[] args) {
		Employe empdata=new Employe();
		empdata.setname("venkat" );
		empdata.setage(25 );
		empdata.setempID("bdhushjd");
		
		System.out.println("name:"+empdata.getname());
		System.out.println("age:"+empdata.getage());
		System.out.println("empID:"+empdata.getempID());
	}

}
