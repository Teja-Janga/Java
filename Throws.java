

public class Throws {

    public static void Exception() throws ArithmeticException {
        int a = 10/0;
        System.out.println("Result: "+a);
    }

    public static void main(String[] args) {
        try {
            Exception(); // Instead of writing the complete code  i've just accessed the method 
        }                //directly with it's name as it is a static method 
        catch(Exception e) {
            System.out.println("Type of Error: "+e.getMessage());
            System.out.println(e);
        }
    }
}
