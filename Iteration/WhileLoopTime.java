// Run this WHILE loop code at least 3 times and 
// note the last line of output. What do you notice? Be prepared to answer
// in a Free Response that follows the next example.
 
public class WhileLoopTime
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
        int x = 100;
        while (x > 0)
        {
            System.out.println(x);
            x = x - 1;
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; 
        System.out.print("This program took "+ duration + " Milliseconds to run.");
    }
}
