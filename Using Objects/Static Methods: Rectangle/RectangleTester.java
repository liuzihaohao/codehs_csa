public class RectangleTester
{
    public static void main(String[] args)
    {
        // Can call static methods
        // WITHOUT creating an object
        Rectangle.rectEquations();
        
        // Cannot call non-static methods without
        // an object
        
        // WRONG
        //int area = Rectangle.area();
        
        // RIGHT
        Rectangle room = new Rectangle(10, 13);
        int area = room.area();
        System.out.println(area);
    }
}
