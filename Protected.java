

class Animal {
    protected String name;
    protected void Sound() {
        System.out.println(name+" is making sound!");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }    
    void bark() {
        Sound();
        System.out.println(name+" is Barking!!");
    }
}

public class Protected {
    public static void main(String[] args) {
        Dog a = new Dog("Ramu");
        a.bark();
    }
}