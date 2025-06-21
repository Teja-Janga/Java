
class A {
    public void one() {
        System.out.println("Class A");
    }
}

class B extends A {                 /* Class A and Class B are in SINGLE INHERITANCE */
    public void two() {
        System.out.println("Class B");
    }
}

class C extends A {                /* Class C and Class C are in HIERARICHAL INHERITANCE */
    public void three() {
        System.out.println("Class C");
    }
}

class D extends B {             /* Class A, Class B, Class D are in MULTILEVEL INHERITANCE */
    public void four() {
        System.out.println("Class D");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        D a = new D();
        a.one();
        a.two();
        a.four();

        C b = new C();
        b.one();
        b.three();
    }
}
