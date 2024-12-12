public class RectangleTester
{
    public static void main(String[] args)
    {
        //Even though the Rectangle class does not have a constructor, we can
        //make a call to a no-argument constructor to initialize rect.
        Rectangle rect = new Rectangle();
        
        //The values of width and height are set to default values
        System.out.println(rect);
        
        //The instance variables still act as normal instance variables
        rect.setWidth(10);
        System.out.println(rect);
        
    }
}
