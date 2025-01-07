public class Rectangle extends Shape {

    private int width;
    private int height;

    /**
     * Notice in this example, we pass a hard coded
     * value to the Superclass constructor. Since
     * all Rectangles have 4 sides, we don't need
     * to ask the user for the sides.
     */
     
    public Rectangle(int width, int height) {
       super(4);
    	this.width = width;
    	this.height = height;
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
        return "A rectangle with a width of " + width 
            + " and a height of " + height;
    }
}