
class Base {
    public void one() {
        System.out.println("This is from Base Class");
    }
}

class Intermediate extends Base {
    public void two() {
        System.out.println("This is from Intermediate Class");
    }
}

class Derived extends Intermediate {
    public void three() {
        System.out.println("This is from Derived Class");
    }
}

public class MLInherit {
    public static void main(String[] args) {
        Derived a = new Derived();
        a.one();
        a.two();
        a.three();
    }
}
