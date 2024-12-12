public class FindMinimum
{
    public static void main(String[] args)
    {
        // Try changing the values and see how the min index and value change.
        int[] scores = {80, 92, 91, 68, 88};
        
        int minIndex = 0;
        
        for (int i = 1; i < scores.length; i++){
        	if (scores[i] < scores[minIndex]) {
        		minIndex = i;
        	}
        }
        
        System.out.print("Minimum number: ");
        System.out.println(scores[minIndex]);
        System.out.print("Found at index: ");
        System.out.println(minIndex);

    }
}