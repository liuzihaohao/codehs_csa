public class HealthyFood extends Food
{
    private String group;
    private String color;
public String getGroup(){
    return group;
}
public void setGroup(String aaa){
    group=aaa;
}
public String getColor(){
    return color;
}
public void setColor(String aaa){
    color=aaa;
}
public HealthyFood(String name, int calories, String group, String color)
    {
        super(name, calories);
        this.group = group;
        this.color = color;
    }
public HealthyFood(String name, int calories, String color)
    {
        super(name, calories);
        this.group = "Fruit";
        this.color = color;
    }
}