public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track rounded to 2 decimals
    public double computeTime(double distance)
    {
        return Math.round(Math.sqrt(2.0*distance/accel)*100)* 0.01d;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}