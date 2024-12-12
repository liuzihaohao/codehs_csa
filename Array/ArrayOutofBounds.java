public class OutOfBounds
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        
        // The for loop iterates up to length, which is 5 in this case. But since
        // we start i at 0 and go up to 5, this tries to access an element at
        // scores[5] which does not exist. Our last element in the array is 
        // scores[4] which is 88. We should instead stop our for loop at 
        // scores.length - 1. 
        
        for(int i = 0; i <= scores.length; i++)
        {
	        System.out.println(scores[i]);
        }
    }
}