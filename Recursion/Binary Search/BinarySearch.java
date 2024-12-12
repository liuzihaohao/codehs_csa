public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 17, 19, 23, 30, 50};
        
        int index1 = binarySearch(arr, 6);
        System.out.println(index1);
        
        int index2 = binarySearch(arr, 30);
        System.out.println(index2);
        
        int index3 = binarySearch(arr, 3);
        System.out.println(index3);
    }

    public static int binarySearch(int[] array, int key)
    {
        // Define your initial minimum index and maximum index 
        // as the end points of your array.
        
        int low = 0; 
        int high = array.length - 1;
        
        while(low <= high)
        {
            // Calculate the mid point index
            int mid = (low + high) / 2;
            
            // Assign cur to the midpoint value
            int cur = array[mid];
            
            if(cur == key) // Match
            {
                return mid;
            }
            else if(cur < key) // Too low
            {
                // Move the bottom index to the index
                // above the current midpoint
                low = mid + 1;
            }
            else // Too high
            {
                // Move the value index to the index
                // below the current midpoint
                high = mid - 1;
            }
        }
        // Return -1 is not found
        return -1;
    }

}
