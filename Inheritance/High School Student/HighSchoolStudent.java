public class HighSchoolStudent extends Student
{
    private int serviceHours;
  
    public HighSchoolStudent(String name, String birthday, int grade, 
            double gpa, int serviceHours)
    {
        super(name, birthday, grade, gpa);
        this.serviceHours = serviceHours;
    }
    
    public int getServiceHours()
    {
        return serviceHours;
    }
}
