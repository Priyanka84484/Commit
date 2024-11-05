import java.util.Scanner;

public class Scanner_practice {
	
	public int sum(int a,int b) {
		int c =  a +  b; 
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
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a = s.nextInt();
		System.out.println("Enter value of b:");
		int b = s.nextInt();
		System.out.println("Enter value of x:");
		int x = s.nextInt();
		System.out.println("Enter value of y:");
		int y = s.nextInt();
		System.out.println("Enter value of p:");
		int p = s.nextInt();
		System.out.println("Enter value of q:");
		int q = s.nextInt();
		System.out.println("Enter value of m:");
		int m = s.nextInt();
		System.out.println("Enter value of n:");
		int n = s.nextInt();
		
		Scanner_practice obj = new Scanner_practice();
		int sumResult = obj.sum(a, b);
		System.out.println("Sum of a and b: " + sumResult);

		int subResult = obj.sub(x, y);
		System.out.println("Subtraction of x and y: " + subResult);

		int multiResult = obj.multi(p, q);
		System.out.println("Multiplication of p and q: " + multiResult);

		int divResult = obj.div(m, n);
		System.out.println("Division of m by n: " + divResult);

	
		s.close();

	}

}


