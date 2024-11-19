

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if(a>0) {
			if(a%2==0) {
				System.out.println("It is not a prime number");
			}
			else {
				System.out.println("It is a prime number");
			}
		}
			 if(a%1==0)
			{
				System.out.println("It is a prime number divisible by 1.");
			}
				else {
					System.out.println("It is a prime number");
				}
	
			 if(a%a==0) {
				System.out.println("It is a prime number divisible by itself.");
			}
			else {
				System.out.println("It is not a prime number");
			}
		}

	}


