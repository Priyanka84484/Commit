
import java.util.Scanner;
public class factorial {
	
	public static long fact(int a) {
		long result = 1;
		for(int i = 1; i <= a;i++) {
			 result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);	
System.out.println("Enter a number: ");
int number = s.nextInt();

if(number <0) {
	System.out.println("factorial is not defined for negative numbers");
}
else {
	System.out.println("factorial of the "+ number+" is "+ fact(number) );
}

	}

}
