
public class Assign1 {

	int roll_no; int age;
	

	public void student()
	{
	System.out.println("Welcome to all of you");
	System.out.println("Automation is very easy");
	//roll_no = 12;
	//age = 18;
	//System.out.println("Deepak Roll No. is "+ roll_no);
	//System.out.println("Deepak Age is "+ age);
	}
	
	public static void main(String[] args) {
	
		Assign1 deepak = new Assign1(); 
		deepak.student();
		deepak.roll_no = 12;
		deepak.age = 18;
		System.out.println("Deepak Roll No. is "+ deepak.roll_no);
		System.out.println("Deepak Age is "+ deepak.age);
		
	Assign1 hari = new Assign1();
	hari.student();
	hari.roll_no = 13;
	hari.age = 19;
	System.out.println("Hari Roll No. is "+ hari.roll_no);
	System.out.println("Hari age is "+ hari.age);

		
	}

	
	
}
