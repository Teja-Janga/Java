public class If_else_if {
    public static void main(String[] args)
    {
        int a=12, b=23, c=34;
        if(a>b && a>c)
        {
            System.out.println("A is the Largest value");
        }   
        else if(b>a && b>c)
        {
            System.out.println("B is the Largest Value");
        }
        else
        {
            System.out.println("C is the Largest Value");
        }
    }
}
