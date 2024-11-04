
public class Assign5 {

	public Assign5() {
		this(10);
		System.out.println("Default Constructor");//4
	}
	public Assign5(int a,int b,int c) {
		this(10,20);
		System.out.println("3 Parameterized Constructor");//2
	}
	
	public Assign5(int a,int b) {
		
		System.out.println("2 Parameterized Constructor");//1
	}
	public Assign5(int a) {
		this(10,20,30);
		System.out.println("1 Parameterized Constructor");//3
	
	}
	public static void main(String[] args) {
	
		Assign5 student = new Assign5();
	

	}

}
