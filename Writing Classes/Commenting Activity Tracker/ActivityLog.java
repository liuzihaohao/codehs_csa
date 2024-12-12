public class ActivityLog
{
    private double numHours;
    private double numMiles;
 //asdfasdf
 //asdfadfasdf
 //qwerqwerqwer
 //asdfasdfasdf
 //asdfasdfasdf
 //asdfa
 //adsfadsf
 //asdfasdf
 /*
 asdfas
 dfasd
 fasdfasdf
 asdfasdf
 */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    public double getMiles()
    {
        return numMiles;
    }
    
    public double getHours() 
    {
        return numHours;
    }
    
}