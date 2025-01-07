public class Student extends Person {
    
	private int grade;
	private double gpa;

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
    
    /**
     * To Override, we need to have the same method signature. Since we
     * are Overriding the object class, we need to use an Object
     * as the formal parameter. Then we need to cast that object to
     * a Student to have access to the methods we need.
     */ 
    @Override
    public boolean equals(Object other) 
    {
        Student otherStudent = (Student) other;
        return super.getName().equals(otherStudent.getName()) 
            && super.getBirthday().equals(otherStudent.getBirthday())
            && this.grade == otherStudent.getGrade();
    }
}
