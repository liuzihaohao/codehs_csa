public class Target
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        int index = 0;
        int target = 91;
        
        while (index < scores.length)
        {
	        if (scores[index] == target)
	        {
		        break;
	        }
	        index ++;
        }
        System.out.println("The target was found at: " + index);
    }
}