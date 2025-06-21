public class strings {
    public static void main(String[] args) {
        //First String
        String a = "Hyderabadi";
        System.out.println(a.length());//Finding the length of string using "length()" method..
        
        //Second String
        String b = " Biryani";
        String c = a.concat(b);//Joining 2 string using "concat()" method 
        System.out.println("After Concatenation : " + c);
        
        //Comparing 2 strings whether they are same or not with boolean datatype
        Boolean result = a.equals(b); //Comparing strings using "equals()" method.
        System.out.println("These 2 string same : " + result);
        
        /*Using method "contains()"
         * to check whether the required string or character
         * is present in the give string or not */
        Boolean result1 = a.contains("d");
        System.out.println(result1);
       
        //We can replace string or character from the given string using method "replace()"
        System.out.println(c.replace(" ", " Chicken "));
        
        //We can Convert characters in a string from upper to lowercase!
        String s1 = "JAVA";
        System.out.println(s1.toLowerCase());//We can change characters from upper to lowercase using "toLwerCase()" method. 
        
        //We can remove whitespaces in a string at starting and ending places of that string.
        String s2 = "   Java Code   ";
        System.out.println(s2.trim()); //We use method "trim()" for removing those whitespaces.

        //We can check whether the given string is empty or not
        String x = "";
        System.out.println(a.isEmpty());
        System.out.println(x.isEmpty());

        //Creating a String using "new" Keyword.
        String name = new String("PYTHON");
        System.out.println(name);
    }
}
