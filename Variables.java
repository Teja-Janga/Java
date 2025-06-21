
public class Variables {
    int instanceVar = 10;
    static int staticVar = 20;
    public static void main(String[] args){
        int localVar = 30;
        System.out.println("Local Variable: "+localVar);
        System.out.println("Static Variable: "+Variables.staticVar);
        Variables v = new Variables();
        System.out.println("Instance Variable: "+v.instanceVar);
    }
}
 