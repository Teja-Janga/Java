// Single Dimensional Array 


public class Arrays {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5}; //Declaration of Array with "int" DataType
        System.out.println(a[3]);  //Accessing an integer item from the array using it's index number.
        a[2] = 2322;
        System.out.println(a[2]);
        System.out.println(a.length);

        //Declaration of an Array with int Datatype
        int[] b;
        //Now allocating the memory for storing integer elements.
        b = new int[4];
        //Allocating memory for 4 integer values.
        b[0] = 12;
        b[1] = 23;
        b[2] = 34;
        b[3] = 45;
        //Now accessing the integer elements of the specified array
        for(int i = 0; i<b.length; i++){
            System.out.println("Element at index" +i+ " : " +b[i]);
        }
        /*2 Dimensional Array Declaration
        * int[][] a={
        * {1, 2, 3},
        * {4, 5, 6},
        * {7, 8, 9} 
        * };
        */
        int[][] c = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
      
        //Printing the 2D array
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                /* i = 0 ==> i=0, 0<3 1 > j=0, 0<3 1 ==>c[0][0]
                 * j = 1 ==> j=1, 1<3, 2 ==> [0][1]
                 * j = 2 ==> j=2, 2<3, 3 ==> [0][2]
                 * j = 3 ==> j=3 3<3(FALSE) Loop Terminate out of this inner loop
                 * Then the outer loop again start iterating until the condition in outer loop also get false
                 * then outer loop also get terminated and the program will be completed. 
                 */
                System.out.print(c[i][j] + " ");//"println" makes everytime the output in newline but not the "print".
            }
            System.out.println();
        }
    }
}

