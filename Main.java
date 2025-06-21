
 /*Syntax:
     * public class ClassName {
     *      //Fields(Variables)
     *      type FieldName;
     * 
     *      //Constructor
     * public ClassName() {
     *      // Initialization of Code
     *      }
     * 
     *      // Methods (behaviours)
     * public void MethodName() {
     *      // Body of Method
     *      }
     * }
     */


class Student {

        int id;         //Here variables are DATA MEMBERS/INSTANCE VARIABLES
        String name;
     }
    public class Main {
        public static void main(String[] args) {

            //Creating an OBJECT for a CLASS called "Student"
            /* ClassName ObjectVariableName = new(keyword) Constructor() */
            Student s1 = new Student();
            System.out.println(s1.id);
            System.out.println(s1.name);
        }
    }
