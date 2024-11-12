
public class Child_method extends Parent_Method {
	
	public void Me() {
	    super.m3();
		super.m1();
		System.out.println("parent three parameterized method");
		super.m2();
		super.m4();
		//super.m3();
		//super.m4();
		//super.m2();
		//super.m3();
	}

	public static void main(String[] args) {
	Child_method obj = new Child_method();
	obj.Me();

	}

}
