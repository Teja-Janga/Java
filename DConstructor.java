


class Student {
    // Now Creating a Default Constructor
    Student() {     /* Here Student() is Constructor ~ Special Method  */
        System.out.println("Example about Default Constructor");
    }
}

public class DConstructor {
    public static void main(String[] args) {
    /* Now creating an Object for Class Student. 
     * Unlike a Regular Method we don't need to call this Constructor.
     * Constructor will be called automatically as soon as Object is created for class
     */
        Student b = new Student();
    }
}
