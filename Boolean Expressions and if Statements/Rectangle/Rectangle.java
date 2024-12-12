public class Rectangle
{
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    // Returns the area of the rectangle
    public int getArea()
    {
        return width * height;
    }
    
    // Returns true if the rectangle is a square
    public boolean isSquare()
    {
        /* 
        * Note: The following statement does not use { }
        * When we have only one line of code for the 
        * conditional statement, you will sometimes see the 
        * code written without the block brackets.
        */
        if(width == height)
            return true;
        return false;
    }
    
    // Sets width ONLY IF newWidth is positive
    // Returns true if width was updated
    public boolean setWidth(int newWidth)
    {
        if(newWidth > 0)
        {
            width = newWidth;
            return true;
        }
        return false;
    }


    // Sets height ONLY IF newHeight is positive
    // Returns true if height was updated
    public boolean setHeight(int newHeight)
    {
        if(newHeight > 0)
        {
            height = newHeight;
            return true;
        }
        return false;
    }
    
    /**
     * Returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}