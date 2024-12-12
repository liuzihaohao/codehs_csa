// A reference value can be compared with null, using == or !=, 
// to determine if the reference actually references an object.

// Run this code first without changing anything to see what happens. 
// Then follow steps 1 and 2 as shown in the comments.

public class NullTest
{
   public static void main(String[] args)
   {
     // Since str is null, indexOf throws a NullPointerException error for str. 
     // 2. Change str and set it equal to "Karel" instead of null. 
     // Then run again and the if statements should each print out that "Karel 
     // contains an a."
     String str = null;
     
     // 1. Comment out this first IF statement and run the program again. 
     if (str.indexOf("a") >= 0)
         System.out.println(str + " contains an a");
         
    //The second if statement avoids the error with a shortcircuit evaluation. 
    //Because str != null is false and we have  &&, the rest of the 
    //boolean expression is not evaluated. 
     if (str != null && str.indexOf("a") >= 0)
         System.out.println(str + " contains an a");
   }
}