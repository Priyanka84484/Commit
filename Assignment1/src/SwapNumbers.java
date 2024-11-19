
public class SwapNumbers {

	public static void main(String[] args) {
		int a, b;
		a = 12;
		b = 15;
		System.out.println("Initial Value of a and b is 12 and 15");
		
		a = a + b;
		//a = a - b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a and b after swapping is ;");
		System.out.println("Value of a = "+ a);
		System.out.println("Value of b = "+ b);

	}

}
