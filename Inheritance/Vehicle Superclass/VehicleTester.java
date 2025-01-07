public class VehicleTester
{
    public static void main(String[] args)
    {
        Car tesla = new Car("Tesla", "Model 3");
        
        Bike trek = new Bike("White", "Mountain Bike");
        
        System.out.println(tesla);
        System.out.println("Has engine: " + tesla.hasEngine());
        System.out.println("Number of Wheels: " + tesla.getWheels());
        System.out.println();
        
        System.out.println(trek);
        System.out.println("Has engine: " + trek.hasEngine());
        System.out.println("Number of Wheels: " + trek.getWheels());
    }
}
