import java.util.ArrayList;

public class Roster {
    
    static private ArrayList<Student> classList=new ArrayList<Student>();
    // Implement the student ArrayList
    
    public static String getLastStudent(){
        return classList.get(classList.size()-1).getName();
    }
    
    public static int getClassSize(){
        return classList.size();
    }
    
    public static String getStudent(int index){
        return classList.get(index).getName();
    }
    
    public static void addStudent(int index,String name,int grade){
        Student tmp=new Student(name,grade);
        classList.add(index,tmp);
    }
    public static void addStudent(String name, int grade)
    {
        // Create Student
        Student tmp=new Student(name,grade);
        // Add to classList
        classList.add(tmp);
    }
    
    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
    
}