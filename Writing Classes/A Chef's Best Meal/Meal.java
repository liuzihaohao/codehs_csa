public class Meal
{
    private String name;
    private String course;
    private int numberofservings;
    
    public Meal(String a,String b,int c){
        name=a;
        course=b;
        numberofservings=c;
    }
    
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public int getNumberOfServings(){
        return numberofservings;
    }
    public String toString(){
        return name+" ("+course+")";
    }
}