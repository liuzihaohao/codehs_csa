public class DefaultValues
{
    public static void main(String[] args)
    {
        // Create a default object
        Object obj1 = new Object();
        
        // Call the toString with a print statement
        System.out.println(obj1);
        
        // Create a second object
        Object obj2 = new Object();
        
        // Test Equality
        boolean oneTwo = obj1.equals(obj2);
        System.out.println("Object 1 == Object 2? " + oneTwo);
        
        // Create a third object as a copy of the first
        Object obj3 = obj1;
        
         // Test Equality
        boolean oneThree = obj1.equals(obj3);
        System.out.println("Object 1 == Object 3? " + oneThree);
        
    }
}
