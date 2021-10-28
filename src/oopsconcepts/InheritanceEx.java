package oopsconcepts;

 class Teacher{
	String designation="Teacher";
	String college="RGUKT";
	
	// method
	void does(){
		System.out.println("teaching");
	}
	}


class HandoopTeacher extends Teacher{
	
	String mainsubject="mechanical";
}

public class InheritanceEx {

	public static void main(String[] args) {
	
		HandoopTeacher obj=new HandoopTeacher();
		
		System.out.println(obj.designation);
		System.out.println(obj.college);
		System.out.println(obj.mainsubject);
	}

}
