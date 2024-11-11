
public class parent {
	
	public parent() {
		this(10,20,30);
	
		System.out.println("Parent default constructor");
		
	}

	public parent(int a) {
		this(20,30);
		System.out.println("Parent one parameterized constructor");
		
	}
	
	public parent(int a,int b) {
		this();
		System.out.println("Parent two parameterized constructor");
	}
	
	public parent(int a, int b, int c) {
	
		System.out.println("Parent three parameterized constructor");
	
	}


	public static void main(String[] args) {
	
		parent obj = new parent(10);

	}

}
