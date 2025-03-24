public class Fruit extends HealthyFood
{
    private boolean isinseason;
    private String vitamins;
    public boolean isInSeason(){
        return isinseason;
    }
    public void setInSeason(boolean aaa){
        isinseason=aaa;
    }
public String getVitamins(){
    return vitamins;
}
public void setVitamins(String aaa){
    vitamins=aaa;
}
public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins){
    super(foodName,calories,"Fruit",foodColor);
    isinseason=isInSeason;
    vitamins=majorVitamins;
}
}