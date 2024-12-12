public class Rectangle
{
    private int width;
    private int height;
    
    public Rectangle(int theWidth, int theHeight)
    {
        width = theWidth;
        height = theHeight;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "\nRectangle with width " + width + " and height " + height;
    }
    
    // We CAN compare objects using .equals
    // IF the .equals method has been implemented
    // Otherwise .equals has the same behavior as ==
    // Often classes have their own equals method, which can 
    // be used to determine whether two objects of the class are equivalent.
    public boolean equals(Rectangle other)
    {
        return width == other.getWidth() && height == other.getHeight();
    }
}