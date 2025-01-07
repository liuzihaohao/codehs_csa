public class VehicleTester
{
    public static void main(String[] args)
    {
        // Create 3 Vehicle objects
        Vehicle tesla = new Car("Tesla", "Model 3");
        Vehicle trek = new Bike("White", "Mountain Bike");
        Vehicle boat = new Vehicle("Boat", true, 0);
        
        // Add to a Vehicle array
        Vehicle[] transportation = new Vehicle[3];
        transportation[0] = tesla;
        transportation[1] = trek;
        transportation[2] = boat;
        
        // Call the getName method for each
        // This will compile since getName is in the Vehicle class
        // Each object will use it's own method.
        for (int i = 0; i < transportation.length; i++){
           System.out.println("Name: " + transportation[i].getName()); 
        }
    }
}