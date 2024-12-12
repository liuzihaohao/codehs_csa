public class Fibonacci
{
    public static void main(String[] args)
    {
        // Adjust the loop to print more numbers.
        for(int i = 0; i < 10; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
    
    
    private static int fibonacci(int x)
    {
        // Two base cases
        if(x == 0 || x == 1)
        {
            return 1;
        }
        
        //Recursive call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
