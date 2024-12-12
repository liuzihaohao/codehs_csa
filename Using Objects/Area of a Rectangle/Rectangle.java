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
    
    /**
     * This method computes and prints the
     * area of the Rectangle.
     * Note it will print the area of the
     * Rectangle object that called it using
     * the dot operator!
     */ 
    public void printArea()
    {
        int area = width * height;
        System.out.println(area);
    }
    
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
