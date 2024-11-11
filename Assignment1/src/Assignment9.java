
public class Assignment9 extends parent {

    
    public Assignment9() {
        this(10, 20, 30);  
        System.out.println("child default constructor");
    }

   
    public Assignment9(int a, float b) {
        super(10); 
        System.out.println("child two parameterized constructor");
    }

   
    public Assignment9(float a) {
        this(10,20);  
        System.out.println("child one parameterized constructor");
    }

   
    public Assignment9(int a, int b, int c) {
        this(10);  
        System.out.println("child three parameterized constructor");
    }

    public static void main(String[] args) {
       
        Assignment9 obj = new Assignment9();
    }
}
