public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(3, 6);
        Rectangle fencePost=new Rectangle(7,2); 
        
        System.out.println(brick);
        System.out.println(fencePost);
        
        // Change the fencePost dimensions
        fencePost = new Rectangle(10, 2);
        System.out.println(fencePost);
        
    }
}