public class Vehicle
{
    private String name;
    private boolean engine;
    private int wheels;
    
    public Vehicle(String name, boolean engine, int wheels)
    {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean hasEngine()
    {
        return engine;
    }
    
    public int getWheels()
    {
        return wheels;
    }
}
