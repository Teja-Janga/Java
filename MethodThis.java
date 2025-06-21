
class A {
    void one() {
        System.out.println("Method-1");
    }
    void two() {
        System.out.println("Method-2");
        this.one();         /* Here we've used this keyword for Method-1 */
    }
}

public class MethodThis {
    public static void main(String[] args) {
        A a = new A();
        a.two();        /* Just because we've used "this" keyword for Method-1 in Method-2
                         * we can call both the methods by just calling Method-2 */
    }
}

 