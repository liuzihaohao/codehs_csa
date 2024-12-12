public class Rectangle
{
    // Attributes
     // Be sure to check out the other file in the sidebar in the code editor!
    private int width;
    private int height;
    
    // Constructor
    // Remember the values of rectWidth and rectHeight
    // are passed by value, so their values are copied
    // to width and height
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
