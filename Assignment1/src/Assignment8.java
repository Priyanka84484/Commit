import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		System.out.println("Solve this Expression : ((((x1*x2)-x3)*x4)+x5)/x6)");
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the value of x1: ");
		int x1 = s.nextInt();

System.out.println("Enter the value of x2: ");
int x2 = s.nextInt();

System.out.println("Enter the value of x3: ");
int x3 = s.nextInt();

System.out.println("Enter the value of x4: ");
int x4 = s.nextInt();

System.out.println("Enter the value of x5: ");
int x5 = s.nextInt();

System.out.println("Enter the value of x6: ");
int x6 = s.nextInt();

Assignment7 obj = new Assignment7();
int multiResult = obj.multi(x1, x2);
int subResult = obj.sub(multiResult, x3);
int multiResult1 = obj.multi(subResult, x4);
int sumResult = obj.sum(multiResult1, x5);
int divResult = obj.div(sumResult, x6);

System.out.println("Answer is : "+ divResult);

s.close();
	
		
}
}
