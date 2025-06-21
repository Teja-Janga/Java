
class A {
    A() {
        System.out.println("Constructor Invoke through THIS keyword to avoid Constructor Overloading");
    }
    A(int i) {
        this();
        System.out.println(i);
    }
}

public class ConstructorThis {
    public static void main(String[] args) {
        A a = new A(122);
    }
}
