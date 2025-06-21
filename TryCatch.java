


        /* Error Code */

// public class TryCatch {
//     public static void main(String[] args) {
//         int[] n = {0, 3, 6, 4, 5};
//         System.out.println(n[11]);
//     }    
// }


        /* Exception Handling Code */

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] n = {0, 3, 6, 4, 5};
            System.out.println(n[11]);
        }
        catch(Exception e) {
            System.out.println("This will get an Error. Try making corrections...");
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Error will cause. Try correctly");
        }
    }
}
