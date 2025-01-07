public class Student extends Person {
    
	private int grade;
	private double gpa;

    /**
     * The Student object only stores grade and gpa. Notice
     * how the contructor takes all 4 variables and passes
     * two of them up to the Person superclass
     */
     
    public Student (String name, String birthday, int grade, double gpa) 
    {
    	super(name, birthday); //Passes to Superclass
    	this.grade = grade; //Stored in Student object
    	this.gpa = gpa; //Stored in Student object
    }

    public int getGrade()
    {
    	return grade;
    }
    
    public double getGpa()
    {
        return gpa;
    }
}