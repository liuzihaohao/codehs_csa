public class ShapeRunner
{
    public static void main(String[] args)
    {
        /**
         * When the rectangle is created, we only need to
         * pass the width and height.
         */ 
        Rectangle rect1 = new Rectangle(5, 4);
        
        System.out.println(rect1);
        
        /**
         * The number of sides gets set when the Rectangle
         * subclass calls the Shape superclass
         */ 
        System.out.println("Number of Sides: " + rect1.getSides());
    }
}
