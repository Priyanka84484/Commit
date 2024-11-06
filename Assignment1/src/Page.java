
public class Page extends Book {
	
	public void M1() {
		System.out.println("I am Book's son Page");
	}

	public void M2() {
		System.out.println("I am father of my son");
	}
	public static void main(String[] args) {

Page obj = new Page();
obj.m1();
obj.M1();
	}

}
