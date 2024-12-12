public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    /**
     * Notice that this constructor now uses the same names as
     * the instance variables. To distinguish, we use this to 
     * represent the instance variable. Without this, the variable
     * refers to the local parameter.
     *
     * We also added a constructor overload, allowing the user to
     * specify the gpa in the constructor if they wish.
     */
    public Student(String firstName, String lastName, int gradeLevel, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }
    
    /**
     * Notice in the second constructor we use this to call back
     * to the current object. In doing so, we are essentially calling
     * the 4 parameter constructor and passing a default value
     * for the gpa. This allows us to reuse code!
     */ 
    
     public Student(String firstName, String lastName, int gradeLevel)
    {
       this(firstName, lastName, gradeLevel, 0.0);
    }

    /*
     * Setter methods are used to update variables.
     * Notice that they have void return and take an
     * input.
     *
     * In this example, we create setters for all
     * variables, but as a developer, you can choose
     * if you want to allow variables to be changed.
     */

    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public void setGradeLevel(int gradeLevel)
    {
        this.gradeLevel = gradeLevel;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public double getGPA()
    {
        return gpa;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}