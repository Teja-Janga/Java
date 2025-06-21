

public class Throw {

    static void ageCheck(int age) {
        if(age<18) {
            throw new ArithmeticException("Access Denied - You're under age");
        }
        else {
            System.out.println("Access Granted - You hae enough age");
        }
    }
        public static void main(String[] args) {
            ageCheck(144);
    }
}
