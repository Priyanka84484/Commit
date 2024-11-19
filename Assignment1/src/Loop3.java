
public class Loop3 {
	public static void triangle() {
		for(int row = 1;row<=5; row++ ) {
			for(int column=1;column<=row;column++) {
				System.out.print(column);
		}
	System.out.println();
		}	
	}

	public static void triangle1() {
		int number = 1;
		for(int column =1; column<=5; column++) {
			for(int row =1;row<=column;row++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
triangle1();
	}
}
