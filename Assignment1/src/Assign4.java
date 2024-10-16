

public class Assign4 {

	public void start() {
	System.out.println("Solve this expression = ((((10+2)-2)+2)*2)/2)");
	}
	public int sum(int a,int b) {
	//int a = 10;	
	//int b = 2;
	int c ;
	c= a + b;
	
	System.out.println("Sum is "+ c);
	return c;
	}
	
	public int sub(int c,int d) {
		int e = c - d;
		System.out.println("Sub is "+ e);
		return e;
		}
	public int multi(int x,int y) {
	int z = x*y;
	System.out.println("Multi is "+z);
	return z;
	}
	public void div(int z,int y) {
		int r = z/y;
		System.out.println("Final result is"+r);
	
	}
	
	public static void main(String[] args) {
		Assign4 ob = new Assign4();
		//ob.sum();
		ob.start();
		int sum =ob.sum(10,2);
		int sub = ob.sub(sum,2);
		int sum1 = ob.sum(sub,2);
		int multi = ob.multi(sum1,2);
		ob.div(multi,2);

	}

}
