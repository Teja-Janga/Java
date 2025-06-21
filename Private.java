

class A {
    private void start() {
        System.out.println("Robot is Starting...");
    }

    public void recharge() {
        System.out.println("Recharging Battery...");
        start();
    }
}

public class Private {
    public static void main(String[] args) {
        A s = new A();
        s.recharge();     /* This line executes normally because
                           * even the other method is private 
                           * it is being in the same class and
                           * the method is being called within class, so no problem */
           
        /* s.start();  ==> If we try to execute this we'll get error 
         * as we are calling only this method out of the class */
    }
}

