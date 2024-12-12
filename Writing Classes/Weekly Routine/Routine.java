public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public Routine(){
        school=0;
        sleep=0;
        friends=0;
        hobbies=0;
    }
    
    public void setSchool(double tmp){
        school=tmp;
    }
    
    public void setSleep(double tmp){
        sleep=tmp;
    }
    
    
    public void setFriends(double tmp){
        friends=tmp;
    }
    
    
    public void setHobbies(double tmp){
        hobbies=tmp;
    }
    
    public double getSchool(){
        return school;
    }
    
    public double getSleep(){
        return sleep;
    }
    
    
    public double getFriends(){
        return friends;
    }
    
    
    public double getHobbies(){
        return hobbies;
    }
    
    
    public void printTotal(){
        System.out.println("How You Spend Your Week");
        System.out.println("At School: "+school*7);
        System.out.println("Sleeping: "+sleep*7);
        System.out.println("With Friends: "+friends*7);
        System.out.println("Doing fun stuff: "+hobbies*7);
        System.out.println("You're busy "+(school+sleep+friends+hobbies)*7+" hours a week!");
    }
}