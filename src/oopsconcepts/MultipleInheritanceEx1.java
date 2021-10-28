package oopsconcepts;

class calculator{
	public float mul(float m,float n) {
		return m*n;
	}
	public float sum(float m,float n) {
		return m+n;
	}
	public float diff(float m,float n) {
		return m-n;
	}
	public float div(float m,float n) {
		return m/n;
	}
}
	class advanced extends calculator{
		public float mod(float m,float n) {
			return m%n;
		}
		public float seq(float m) {
			return m*m;
		}
		public float seqt(float m) {
			System.out.println(Math.sqrt(m));
			return m;
		}
	}

	class area extends advanced{
		public float rectangle(float l,float b) {
			return l*b;
		}
		public float circle(float r) {
			return (float) (3.142*r*r);
		
		}
	
}

public class MultipleInheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area venkat=new area();
		float addresult=venkat.sum(10, 25);
		float difresult=venkat.diff(23, 45);
		float divresult=venkat.div(23, 24);
		float mulresult=venkat.mul(12, 13);
		float rectangleresult=venkat.rectangle(15, 20);
		float circleresult=venkat.circle(20);
		
		System.out.println(addresult);
		System.out.println(difresult);
		System.out.println(divresult);
		System.out.println(mulresult);
		System.out.println( rectangleresult);
		System.out.println(circleresult);
		
	
	}

}
