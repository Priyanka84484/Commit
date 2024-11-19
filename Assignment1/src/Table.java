
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Which Table do you want to search?");
int a = s.nextInt();
int i;
System.out.println("Table of "+ a +"is");
for(i=1;i<=10;i++) {
	int result = a*i;
	System.out.println(a + "*" + i + "="+ result);
	//System.out.println(result);
}

	}

}
