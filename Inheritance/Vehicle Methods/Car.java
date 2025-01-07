public class Car extends Vehicle
{
    private String make;
    private String model;
    
    public Car(String make, String model)
    {
        super("Car", true, 4);
        this.make = make;
        this.model = model;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    // Override the getName method
    @Override
    public String getName()
    {
        return make + " " + model;   
    }
    
    public String toString(){
        return "A " + this.getName() +".";
    }
}