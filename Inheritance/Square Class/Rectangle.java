public class Rectangle  {

    private int width;
    private int height;
     
    public Rectangle(int width, int height)
    {
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
    
    public int area() 
    {
        return width * height;    
    }
    
    public String toString()
    {
        return "A rectangle with a width of " + width 
            + " and a height of " + height;
    }
}