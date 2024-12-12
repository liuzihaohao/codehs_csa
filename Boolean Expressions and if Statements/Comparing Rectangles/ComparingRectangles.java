//comparing rectangles 

public class ComparingRectangles
{
    public static void main(String[] args)
    {
        // We can compare primitives with ==
        int x = 5;
        int y = 5;
        if(x == y)
        {
            System.out.println(x + " is equal to " + y);
        }
        
        // But we cannot compare objects with ==
        // Comparing objects with == compares memory addresses, 
        // NOT the actual object content!
        Rectangle one = new Rectangle(5, 10);
        Rectangle two = new Rectangle(5, 10);
        
        
        // The print statement with the ELSE will display and not the print 
        // statement with the IF below since one == two evaluates
        // to FALSE. We are comparing 2 memory addresses with these 
        // objects when we use == and they are NOT the same!
        if(one == two)
        {
            System.out.println(one + " == " + two);
        }
        else System.out.println("\nPointers are NOT the same here.");
        
        // The print statement with the IF will display and not the print 
        // statement with the ELSE below since one.equals(two) evaluates
        // to TRUE. We are comparing content of these 2 objects 
        // and not the pointers (memory addresses), and they are equivalent.
        
        // Go to the Rectangle class to see how the equals() method of 
        // Java's Object class was overidden. Often classes have their own equals 
        // method, which can be used to determine whether two objects of the class 
        // are equivalent.
        if(one.equals(two))
        {
            System.out.println(one + " is equal to " + two);
        }
    }
}
