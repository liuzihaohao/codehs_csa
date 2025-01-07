import java.util.ArrayList;
public class ArrayVsArrayList
{
    public static void main(String[] args)
    {
        String[] array = {"This ","Array ","Has ","Five ","Values "};
        printArray(array);
        // arrays need to be initialized with the total number of values that will be stored
        String[] expandedArray = new String[6];
        //in order to expand arrays, we need to create a new array with a bigger size
        //and copy values from original to the new one:
        for(int i =  0; i < array.length; i++)
        {
            expandedArray[i] = array[i];
        }
        expandedArray[expandedArray.length-1] = "Now it has six!";
        printArray(expandedArray);
        
        //================================================================
        
        //ArrayLists can be initialized without determining the size:
        ArrayList<String> arrList = new ArrayList<String>();
        //We can add an unlimited number of String values to arrList
    }
    
    
    public static void printArray(String[] array)
    {
        for(String elem: array)
        {
            System.out.print(elem);
        }
        System.out.println();
    }
}
