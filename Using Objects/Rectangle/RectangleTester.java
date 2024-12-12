public class RectangleTester
{
    public static void main(String[] args)
    {
        // Create a rectangle
        Rectangle car = new Rectangle(4, 8);
        
        // PRINT the area
        car.printArea();
        
        // GET the area
        int carArea = car.getArea();
        System.out.print("The area of the car is ");
        System.out.println(carArea);
        
        // You cannot assign the return value of a method
        // to a variable if the method returns void.
        // "void" means "does not return a value"
        // Hence, 
        // int carArea = car.printArea();
        // will cause an error because we are trying to assign a 
        // value that does not exist to the variable carArea.
        
        // Reset the width
        car.setWidth(3);
        // Get the area again
        carArea = car.getArea();
        System.out.print("Now the area of the car is ");
        System.out.println(carArea);
        
    }
}
