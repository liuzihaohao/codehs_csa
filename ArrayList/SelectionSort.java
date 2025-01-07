import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {5, 3, 4, 1, 6, 2};
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));
        
        selectionSort(arr);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {6, 3, 2, 10, 15, 8, 1, 90, 7};

        System.out.println("===========");

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr2));
        
        selectionSort(arr2);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr2));
        
        
    }
    
    private static void selectionSort(int[] arr)
    {
        for(int curIndex = 0; curIndex < arr.length - 1; curIndex++)
        {
            // Show current state of array at each pass
            System.out.println(Arrays.toString(arr));
            
            // Find minimum in the rest of the list
            int minIndex = findMin(arr, curIndex);
            
            // Swap the minimum into the correct position
            swap(arr, curIndex, minIndex);
        }
    }
    
    private static int findMin(int[] arr, int startingIndex)
    {
        int minIndex = startingIndex;
        
        for(int i = minIndex + 1; i < arr.length; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }
        
        return minIndex;
    }

    private static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    private int[] selectionSort2(int[] arr)
    {
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.println(Arrays.toString(arr));

            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
        return arr;
    }
}