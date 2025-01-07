public class Student extends Person {
    
    private int grade;
    
    public Student(String name, int grade)
    {
        super(name);
        this.grade = grade;
    }
    
    public void printGrade(){
        System.out.println("Grade " + grade);
    }
}
