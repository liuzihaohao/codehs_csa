public class SquareTester {
 
   public static void main(String[] args) {
       
        Square box = new Square(5);
        Rectangle box2 = new Rectangle(5, 4);
        
        /**
         * When this runs, the Square box will get
         * the toString from the Square class
         * even though it is defined in the 
         * Rectangle class.
         */
         
        System.out.println(box);
        System.out.println("Area: "  + box.getArea());
        
        System.out.println(box2);
        System.out.println("Area: "  + box2.getArea());
   }
}
