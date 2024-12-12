public class BinaryRecursion
{
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 17, 19, 23, 30, 50};
        
        // The recursive method takes the initial min
        // and max indices as parameters
        int index1 = binaryRec(arr, 6, 0, arr.length - 1);
        System.out.println(index1);
        
        int index2 = binaryRec(arr, 30, 0, arr.length - 1);
        System.out.println(index2);
        
        int index3 = binaryRec(arr, 40, 0, arr.length - 1);
        System.out.println(index3);
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        
        // Calculate the midpoint based on the current begining and 
        // ending points
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
        		
        	// Base Case - we match our target
        	if (target == array[mid]) { 
        			return mid;  
        	}
        
            if (target < array[mid]) { // Too high
                // Recursive call replacing the end point with the 
                // index below the mid-point.
                return binaryRec(array, target, begin, mid - 1);
            }
            
            if (target > array[mid]) { // Too Low
                // Recursive call replacing the begin point with the 
                // index above the mid-point.
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case if not found.
    }

}