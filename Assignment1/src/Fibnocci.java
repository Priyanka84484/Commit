
import java.util.Scanner;
public class Fibnocci {

	public static void fib(int a) {
		long first = 0,  second = 1;
		System.out.println("Fibonacci Series :");
		
		for(int i=1; i<a; i++) {
		 System.out.println(first + " ");
		 long next = first + second;
		 first = second;
		 second = next;
		
		}
	System.out.println();
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Print a Fibnocci Series upto : ");
int num = s.nextInt();

if (num < 0) {
	System.out.println("Fibnocci Series is 0");
}
else {
	fib(num);

	}
s.close();
	}
}
//0 1 1 2 3 5 8 13 