
class A {
    public void one() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void two() {
        System.out.println("Class B");
        System.out.println();
    }
}

class C extends A {
    public void three() {
        System.out.println("Class C");
        System.out.println();
    }
}

class D extends A {
    public void four() {
        System.out.println("Class D");
        System.out.println();
    }
}

public class Hierarichal {

    public static void main(String[] args) {

        B a = new B();      /* Creating object "a" for Class "B" */
        a.one();
        a.two();

        C b = new C();      /* Creating object "b" for Class "C" */
        b.one();
        b.three();

        D c = new D();      /* Creating object "c" for Class "D" */
        c.one();
        c.four();
    }
}