
public class Assignment6 {
	
	public void m0() {
		System.out.println("Default Method");
		//this.m4();
	}

	public void m1() {
		System.out.println("1 Parameterized Method");
	}
	public void m2() {
		System.out.println("2 Paramenterized Method");
		this.m1();
	}
	public void m3() {
		System.out.println("3 Parameterized Method");
		this.m0();
		this.m4();
this.m2();
	}
	public void m4() {
		System.out.println("4 Parameterized Method");
		//this.m2();
	}
	
	public static void main(String[] args) {
		
		Assignment6 obj = new Assignment6();
		obj.m3();

	}

}
