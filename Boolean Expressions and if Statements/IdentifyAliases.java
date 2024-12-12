//Object reference values can be compared, using == and !=, to identify aliases.

public class IdentifyAliases
{
   public static void main(String[] args)
   {
     
     // str1 is an object reference to the String object that has the characters
     // "Karel" in it.
     String str1 = "Karel";
     String str2 = str1;
     
     // This will print Karel since str2 has been assigned a copy of the value in
     // str1.  
     System.out.println(str2);
     
     // The statement below will be true since the 2 vars refer to the same object
     // Thus, they are aliases!
     System.out.println(str1 == str2);
     
     // This statement will also be true since str1 and str2 
     // refer to the same object so the characters will be the same. 
     System.out.println(str1.equals(str2));
   }
}