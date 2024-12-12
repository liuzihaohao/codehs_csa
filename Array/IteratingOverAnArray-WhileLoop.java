public class MyArray
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        
        int i = 0;
        
        while (i < scores.length)
        {
	        // This prints out the ith element!
	        System.out.println(scores[i]);
	        i ++;
        }
    }
}