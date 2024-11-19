
public class Loop2 {

	public static void star() {
		for(int row = 5; row>=1; row--) {
			for(int column = 1; column<=row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star1() {
		for(int column =1; column<=5; column++) {
			for(int row = column; row<5 ;row++ ) {
				System.out.print(" ");
			}
				for(int row = 1; row<=column; row++) {
					System.out.print("*");
				}
			
			System.out.println();	
		}
		}
		
	public static void star2() {
		for(int column = 1; column<=5; column++) {
			for(int row = column; row<5; row++) {
				System.out.print(" ");
			}
			for(int row=1; row<=(2*column - 1); row++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void star3() {
		for(int column = 4; column>=1; column--) {
			for(int row = 5; row>column; row--) {
				System.out.print(" ");
			}
			for(int row =1; row<=(2*column -1); row++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	//star2();
	//star3();
	star();


	}

}
