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
    
    public String toString(){
        return "A " + make + " " + model +".";
    }
}
