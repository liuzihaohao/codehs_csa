public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car a=new Car("a",12);
        // Print out the model
        System.out.println(a.getModel());
        // Print out the fuelLevel
        System.out.println(a.getFuelLevel());
        // Print how many miles are left with 23 mpg
        System.out.println(a.milesLeft(23));
        // Print the object
        System.out.println(a);
        // Create an ElectricCar object
        ElectricCar b=new ElectricCar ("b",22);
        // Print out the model
        System.out.println(b.getModel());
        // Print out the fuelLevel
        System.out.println(b.getFuelLevel());
        // Print how many miles are left with 400 miles per charge
        System.out.println(b.milesLeft(400));
        // Print the object
        System.out.println(b);
    }
}