
class Student {
    int id;
    String name;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void Display() {
        System.out.println(id+" : "+name);
    }
}

public class PConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(200910567,"Teja");
        Student s2 = new Student(200910588, "Shoaib");
        s1.Display();
        s2.Display();
    }
}
