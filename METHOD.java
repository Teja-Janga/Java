
class Student {
    int rollno;
    String name;    // Data Members

    // Method-1 ~ insertRecord
    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method-2 ~ displayInfo
    void displayInfo() {
        System.out.println(rollno+" "+name);
    }
}

    public class METHOD {
        public static void main(String[] args) {
            Student s1 = new Student();         /* Object Creation for CLASS Student*/
            Student s2 = new Student();
            s1.insertRecord(200910567, "Teja");     /* MethodCall */
            s2.insertRecord(200910588, "Shoaib");   /* MethodCall */
            s1.displayInfo();       /* MethodCall */
            s2.displayInfo();       /* MethodCall */
        }
    }
