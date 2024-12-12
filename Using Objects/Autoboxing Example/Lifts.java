public class Lifts
{
    private double maxSquat; // maximum amout of weight
    private double maxBench; // can lift in pounds
    private double maxDeadlift;
    
    public Lifts(double squat, double bench, double deadlift)
    {
        maxSquat = squat;
        maxBench = bench;
        maxDeadlift = deadlift;
    }
    
    public void printSquatVolumeWorkout(Double percentage)
    {
        // Round to two places
        double weight = ((int)(maxSquat * percentage * 100)) / 100.0;
        System.out.println("6 x 3 at " + weight);
    }
    
    public void setSquat(double newMax)
    {
        maxSquat = newMax;
    }
    
    
    public void printSquatPyramidWorkout(Integer maxReps)
    {   
        // Round to two places
        double weight = ((int)(maxSquat * .6 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
        maxReps -= 2;
        
        // Round to two places
        weight = ((int)(maxSquat * .8 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
        maxReps -= 2;
        // Round to two places
        weight = ((int)(maxSquat * .9 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
    }
    
    /*  Other methods would go here */
    
    // Computes how much weight you have to add to each
    // side of a 45 lb barbell
    // Note the integer division
    public int computePlateWeight(int weight)
    {
        return (weight - 45) / 2;
    }
}
