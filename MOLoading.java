

class Add {
    static int add(int a, int b) {
        return a+b;
    }
    
    static double add(double a, double b) {
        return a+b; 
    }
}

public class MOLoading {
    public static void main(String[] args) {
        System.out.println(Add.add(10,20)); 
        System.out.println(Add.add(13.44,3.14));
    }
}


                   // ff