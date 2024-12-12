public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // Prints the dimensions of the rectangle
    public String printDims()
    {
        String rect = "Rectangle with width: " + width;
        rect += " and height: " + height;
        
        return rect;
    }
}
