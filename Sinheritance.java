
class Base {                  /* Parent Class (base) */
    public void one() {         /* Here one() is a method */
        System.out.println("First example on Single-Inheritance");
    }
}

class Derived extends Base {   /* Child Class (Derived), we use "extends" keywords so that child class inherit from parent class */
    public void two() {         /* here two() is another method */
        System.out.println("2nd Method");
    }
}

public class Sinheritance {
    public static void main(String[] args) {
        /* 
         * After Child Class inherit methods/behaviour of Parent class
         * Object should only be created for Child Class not for Parent Class
         */
        Derived a = new Derived();      /* Creating object for Child Class */
        a.one();            
        a.two();
    }
}