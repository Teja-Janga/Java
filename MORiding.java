
/* METHOD OVERRIDING:
 * When the same method is being used in multiple classes under inheritance,
 * their will be the conflict about which method should be executed. 
 * Due to this conflict only newly updated method will only get executed 
 * leaving the method defined in previous classes, this is METHOD OVERRIDING
 * To overcome this we use "super" keyword   
 */



class Phone {
    public void displayInfo() {
        System.out.println("Mobile Phones");
    }
}

class Android extends Phone {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I have IQOO NEO 7 5G Mobile Phone");
    }
}

public class MORiding {
    public static void main(String[] args) {
        Android a = new Android();
        a.displayInfo();
    }
}
