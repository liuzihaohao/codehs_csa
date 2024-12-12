public class LiftsTester
{
    public static void main(String[] args)
    {
        Lifts weights = new Lifts(183, 140, 220);
        
        // Create variables 
        Double percent = 0.75;
        double newSquat = 185;
        int numReps = 10;
        Integer barWeight = 180;
        
        /* This method takes a Double (object).
         * Note that both calls work. The
         * first passes a Double (object) and
         * the second passes a double (primitive).
         */
        weights.printSquatVolumeWorkout(percent);
        
        double lightPercent = 0.50;
        weights.printSquatVolumeWorkout(lightPercent);
        
        
        /* This method takes a double (primitive).
         * Note that both calls work. The first
         * passes a double (primitive) and the
         * second passses a Double (object).
         */
        weights.setSquat(newSquat);

        Double newMax = newSquat + 5;
        weights.setSquat(newMax);
        
        
        // This method takes an int, but
        // accepts Integer
        System.out.println(weights.computePlateWeight(barWeight));
        
        // This method takes an Integer, but
        // accepts int
        weights.printSquatPyramidWorkout(numReps);
        
        
    }
}
