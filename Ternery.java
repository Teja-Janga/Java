public class Ternery {
    public static void main(String[] args) 
    {
        int a = 10, b=20, max;
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        //Largest among 2 values
        max = (b > a) ? b : a;
        System.out.println("Max = " + max);
    }
}
