
public class Assign3 {

	public void Start() {
	System.out.println("Solve this expression: (((((10*2)-2)-2)+2)/2)");
 	}
	
	public int multi(int a,int b) {
		int c = a*b;
		System.out.println("Multiplication is "+ c );
		return c;
		
	}
	
	public int sub(int c,int d) {
		int e = c-d;
		System.out.println("Subtraction is "+ e);
		return e;

	}
	
	public int sum(int e,int f) {
		int g = e+f;
		System.out.println("Sum is "+g);
		return g;
	}
	
	public void div(int g,int h) {
		int i = g/h;
		System.out.println("Final answer is "+ i);
	}
	public static void main(String[] args) {
		
		Assign3 obj = new Assign3();
		obj.Start();
		int Multi = obj.multi(10, 2);
		int Sub = obj.sub(Multi,2);
		int Sub1 = obj.sub(Sub,2);
		int Sum = obj.sum(Sub1, 2);
		obj.div(Sum, 2);
		
		System.out.println("Resolved");

	}

}
