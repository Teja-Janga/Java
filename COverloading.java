
class Student {
    int id;
    String name;
    int age;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    void Display() {
        System.out.println(id+" : "+name+" : "+age);
    }
}

public class COverloading {
    public static void main(String[] args) {
        Student s1 = new Student(200910567,"Teja",23);
        Student s2 = new Student(200910588,"Shoaib", 22);
        s1.Display();
        s2.Display();
    }
}
