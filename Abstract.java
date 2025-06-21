

// Abstract class
abstract class Animal {
    abstract void sound();     // Abstract method (no body)

    void sleep() {      // Regular method
        System.out.println("Sleeping...");
    }
}

// Subclass
class Dog extends Animal {

    void sound() {     // Must override the abstract method
        System.out.println("Dog barks!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Outputs: Dog barks 🐶
        //d.sleep();  // Outputs: Sleeping...
    }
}

