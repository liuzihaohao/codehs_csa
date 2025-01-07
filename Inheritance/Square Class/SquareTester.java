public class SquareTester
{
    public static void main(String[] args)
    {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 7);
        
        // The Square toString will override the rectangle toString
        System.out.println(square);
        
        // The Rectangle will return the toString from the Rectangle class
        System.out.println(rectangle);
    }
}