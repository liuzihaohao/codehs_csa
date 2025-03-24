public class Food
{
    private String name;
    private int calories;
    
public int getCalories(){
    return calories;
}
public void setCalories(int aaa){
    calories=aaa;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public Food (String foodName, int calories){
    name=foodName;
    this.calories=calories;
}
public String toString(){
    return name+" has "+calories+" calories";
}
}