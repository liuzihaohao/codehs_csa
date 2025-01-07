public class LinearSearch
{
    
    public static void main(String[] args)
    {
        int[] arr = {9, 5, 7, 6, 3, 1, 4, 8};
        
       
        int index1 = linearSearch(arr, 6);
        System.out.print("The value 6 can be found at index: ");
        System.out.println(index1);
        
        int index2 = linearSearch(arr, 5);
        System.out.print("The value 5 can be found at index: ");
        System.out.println(index2);
        
        
        int index3 = linearSearch(arr, 70);
        System.out.print("The value 70 can be found at index: ");
        System.out.println(index3);
    }
    
    /**
     * This method takes an array called array and a 
     * key to search for, and returns the index of
     * key if it is in the array or -1 if it is not
     * found.
     */
    public static int linearSearch(int[] array, int key)
    {
        for(int i = 0; i < array.length; i++)
        {
            int element = array[i];
            if(element == key)
            {
                return i;
            }
        }
        return -1;
    }
}
