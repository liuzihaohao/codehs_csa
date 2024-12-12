public class LoopExecution
{
    public static void main(String[] args)
    {  
       // Call executionCount
       executionCount();
    }
     
    // Shows execution count for inner and outer loops 
    public static void executionCount()
    {
        for (int row = 0; row < 3; row++)
       {
           for (int col = 0; col < 5; col++)
           {
               System.out.print("\nThe inner loop executes " + (col + 1) + " times");
           }
           System.out.println("\nThe outer loop executes " + (row + 1) + " times");
       }
    }
}