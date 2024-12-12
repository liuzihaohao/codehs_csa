// Run this FOR loop code at least 3 times and 
// note the last line of output. This FOR loop is equivalent to 
// the WHILE loop you ran in the last example. 
// What do you notice? Be prepared to answer
// in the Free Response that follows.

public class ForLoopTime
{
    // Note start time with System.nanoTime to see how much time
    // elapses to run this while loop.
    static long startTime = System.currentTimeMillis();
    
    public static void main(String[] args)
    {  
       // Call timeElapsed
       timeElapsed();
    }
     
    // This method runs a while loop and measures the time elapsed from the 
    // start of the program. 
    public static void timeElapsed()
    {
        for (int x = 100; x > 0; x = x - 1)
        {
            System.out.println(x);
        }
            
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; 
        System.out.print("This program took "+ duration + " Milliseconds to run.");
    }
}