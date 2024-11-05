import java.util.Scanner;

public class Assignment7 {
	
	public int sum(int x1,int x2) {
		int c =  x1 +  x2; 
		return c;
	}
public int sub(int x, int y) {
	int z = x-y;
return z;
}
public int multi(int p, int q) { 
int s = p*q;
return s;
}
public int div(int m, int n) {
int o = m/n;
return o;
}
	public static void main(String[] args) {
		
		System.out.println("Solve this Expression : (((((x1+x2)-x3)+x4)*x5)/x6)");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of x1:");
		int a = s.nextInt();
		System.out.println("Enter value of x2:");
		int b = s.nextInt();
		System.out.println("Enter value of x3:");
		int x = s.nextInt();
		System.out.println("Enter value of x4:");
		int y = s.nextInt();
		System.out.println("Enter value of x5:");
		int p = s.nextInt();
		System.out.println("Enter value of x6:");
		int q = s.nextInt();
		
		
		Assignment7 obj = new Assignment7();
		int sumResult = obj.sum(a, b);
	//	System.out.println("Sum of a and b: " + sumResult);

		int subResult = obj.sub(sumResult, x);
		//System.out.println("Subtraction of x and y: " + subResult);
		
		int sumResult1 = obj.sum(subResult, y);

		int multiResult = obj.multi(sumResult1, p);
		//System.out.println("Multiplication of p and q: " + multiResult);

		int divResult = obj.div(multiResult, q);
		System.out.println("Answer is " + divResult);

	
		s.close();

	}

}
