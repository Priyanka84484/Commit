
public class Parent_Method {
	
	public void m1() {
		System.out.println("Parent default method");
		//this.m2();
	}

	public void m2() {
		//this.m4();
		System.out.println("Parent 1 parameterized method");
	}
	
	public void m3() {
		//this.m2();
		System.out.println("Parent 2 parameterized method");
	
	}
	
	public void m4() {
		this.m1();
		System.out.println("Parent 3 parameterized method");
		this.m2();
		this.m3();
	}
	
	public static void main(String[] args) {
		Parent_Method obj = new Parent_Method();
obj.m4();
	}

}
