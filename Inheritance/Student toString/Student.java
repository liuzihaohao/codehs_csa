public class Student extends Person {
    
	private int grade;
	private double gpa;

     
    // Similar Student class to the previous examples.
    public Student (String name, String birthday, int grade, double gpa) 
    {
    	super(name, birthday);
    	this.grade = grade;
    	this.gpa = gpa; 
    }

    public int getGrade()
    {
    	return grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    /** We will override the toString in the student class
     * to display name and grade
     */
     
    public String toString()
    {
        return "Name: " + super.getName() + "\nGrade: " + grade;
    }
}