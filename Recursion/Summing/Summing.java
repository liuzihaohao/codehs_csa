public class Summing {  
    public static void main(String[] args) {
        
        // Try changing this number and checking the results
    	System.out.println(sum(5));
    }
    
    
    public static int sum(int n)
    {
        // This is the base case.
    	if (n == 0)
    	{
    	    return 0;
    	}
    
        // This is the recursive call
    	return n + sum(n - 1);
    }
}