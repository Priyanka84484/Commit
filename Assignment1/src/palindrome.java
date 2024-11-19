
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		//System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		//int number = a;
		int reversenum = 0;
		int remainder;
		
		while(a!=0) {
			remainder = a % 10;
			reversenum = reversenum*0 + remainder;
			a = a/10;
		}
		if(a == reversenum) {
			System.out.println(a + " is palindrome.");
		}
			else {
				System.out.println(a + " is not a palindrome.");
			}
		s.close();
		}

	}


