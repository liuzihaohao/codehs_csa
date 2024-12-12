public class RectangleTester 
{
    public static void main(String[] args)
    {
        // Create a new rectangle with a width of 10 and a height of 3
        Rectangle room = new Rectangle(10, 3);
        
        // Print out information about the rectangle
        System.out.println("Rectangle Room");
        System.out.println(room);
        
        // Create a square in which the width and height is 1
        Rectangle die = new Rectangle(1);
        
        // Print out information about the rectangle
        // Notice this rectangle has different values for
        // the instance variables.
        System.out.println("Rectangle die");
        System.out.println(die);
        
    }
}
