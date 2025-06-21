public class Break {
    public static void main(String[] args)
    {
        for(int i = 0; i<10; i++)
        {
            if(i>6){
                break;//Break will terminate loop if the condition is satisfied.
            }
            if(i==4){
                continue;//Continue will skip the iteration according to the condition inside it.
            }
            System.out.println(i);
        }
    }
}
