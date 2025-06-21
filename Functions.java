public class Functions {
    //Function-1 (message)
    public static void message() {
        System.out.println("This is the First Function with simple message...");
    }
    //Function-2 (sum)
    public static void sum(int a, int b){       //a,b are PARAMETERS.
        int c;
        c = a + b;
        System.out.println("Sum of a = " +a+ " and b = " +b+ " is " +c);
    }
    public static void main(String[] args) {
        message();
        sum(2232,222);          // 2232, 222 are ARGUMENTS.
    }
}
