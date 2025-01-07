public class Student extends Person {

	private int grade;
	private double gpa;

    // Notice no call to the Superclass constructor!
    public Student () {
    	this.grade = 9;
    	this.gpa = 4.0;
    }

    public int getGrade()
    {
        return grade;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
}
