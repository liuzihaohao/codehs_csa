public class Chef
{
    String name;
    String restaurant;
    Meal bestMeal;
    
    public Chef(String a,String b,Meal c){
        name=a;
        restaurant=b;
        bestMeal=c;
    }
    
    public String getName(){
        return name;
    }public String getRestaurant(){
        return restaurant;
    }public String getMealName(){
        return bestMeal.getName();
    }public int getMealServings(){
        return bestMeal.getNumberOfServings();
    }public String getMealCourse(){
        return bestMeal.getCourse();
    }
    
    public String toString(){
        return "Chef "+name+" works at "+restaurant+" and is best known for "+bestMeal;
    }
}