public class Student
{
    private String name;
    private int id;
    private double gpa;
    
   // Constructor goes here
   
   
    public String getName(){
       return name;
    }
   
    public int getID(){
       return id;
    }
    
    public double getGPA(){
        return gpa;
    }
   
    public String toString(){
        return name + " (" + id + ")";
    }
}
