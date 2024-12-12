public class IterationCounts
{
    public static void main(String[] args)
    {  
       // Call showIterationCount to show iteration counts of inner
       // and outer loops
       showIterationCount();
    }
     
    // Shows walk through of loops printing where outer loop iterates 5 times
    // and inner loop executes 2 times every time outer loop executes
    public static void showIterationCount()
    {
      for (int i = 1; i <= 5; i++) 
      {
         System.out.println("\nOuter loop iteration " + i);
         for (int j = 1; j <= 2; j++) 
         {
            System.out.println("Inner loop iteration " + "i = " + i + "; j = " + j);
         }
      }
    }
}
