public class Rectangle
{
    private int width;
    private int length;
    
    public Rectangle(int theWidth, int theLength)
    {
        width = theWidth;
        length = theLength;
    }

    public int area()
    {
        return width * length;
    }
    
    public static void rectEquations()
    {
	    System.out.println("The formula for area is: L * W");
	    System.out.println("The formula for perimeter is: 2(L + W)");
    }

    
    public String toString()
    {
        return "Rectangle: " + width + " x " + length;
    }

}
