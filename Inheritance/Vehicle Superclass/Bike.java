public class Bike extends Vehicle
{
    private String color;
    private String type;
    
    public Bike(String color, String type)
    {
        super("Bicycle", false, 2);
        this.color = color;
        this.type = type;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String toString(){
        return "A " + color + " " + type +".";
    }
}