
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("Enter number :");
	int num = s.nextInt();
	
	int originalnumber = num;
	
	int numDigits = String.valueOf(num).length();
	
	int sum = 0;
	
	while(num>0) {
		int digit = num % 10;
		sum += Math.pow(digit, numDigits);
		num /= 10;
		
	}
	
	if(sum== originalnumber) {
		System.out.println(originalnumber +" is an Armstrong");
	
	}
	else {
		System.out.println(originalnumber + " is not an Armstrong");
	}
	}

}
