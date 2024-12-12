import java.util.Scanner;
// Has the user input several completion times for running
// a 40 yard dash and computes the average time.
 
public class RunningAverage
{
    public static void main(String[] args)
    {
        // Initialize variables to track the 40 yard dash times
        // numInputs is the number of races run and totalTime is the total
        // time of all of the races run combined (so we can compute the average)
        int numInputs = 0;
        double totalTime = 0;
        
        //call static method average to compute averages based on user input
        // Notice that the average method meeds to be OUTSIDE the main method 
        // to be called. 
        average(numInputs, totalTime);
        
    }
        
    public static void average(int myNumInputs, double myTotalTime)
    {
        // Define a SENTINEL value that will signal
        // the end of user input, which is another way to end a while loop!
        // This is sometimes called a "loop and a half."
        final double SENTINEL = -1;
        Scanner input  = new Scanner(System.in);
        // Loop and a half to continually prompt the user for more input
        while(true)
        {
            // Input a new 40 yard dash time
            
            System.out.println("Input your 40 yard dash time in seconds (-1 to stop): ");
            double time = input.nextDouble();
            
            // If user inputs the SENTINEL value, end the loop
            if(time == SENTINEL)
            {
                break;    
            }
            
            // Update the variables to include the new running time
            myNumInputs++;
            myTotalTime += time;
        }
        
        // Compute and print out the average running time
        if (myNumInputs > 0)
        {
            double average = myTotalTime / myNumInputs;
            System.out.println("Average 40 yard dash time: " + average + " seconds.");
        }
        else {
            System.out.println("You didn't enter any times!");
        }
    }
}