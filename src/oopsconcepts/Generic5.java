package oopsconcepts;

class MyGen<T>{
	T obj;
	void add(T obj) {this.obj=obj;}
	T get() {return obj;}
}

public class Generic5 {

	public static void main(String[] args) {
		
		MyGen<Integer> m1=new MyGen<Integer>();
		
		m1.add(10);
		
		System.out.println(m1.get());
		 
	}

}
