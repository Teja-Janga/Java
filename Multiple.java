
/* Java doesn't support MULTIPLE INHERITANCE 
 * as it cause conflicts from multiple paths of inheritance. 
 * So we use INTERFACES instead of classes as these only method signature 
 * without method bodies, so there's no conflict. 
 * So Java allows INTERFACE to achieve Multiple Inheritance.
 */

interface A {
    public void Method(int a);
}
 interface B {
    public void Method(int a);
 }

 class C implements A, B {
    public void Method(int a) {
        System.out.println("The value of a is : "+a);
    }
 }
    
public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.Method(2443);
    }
}
