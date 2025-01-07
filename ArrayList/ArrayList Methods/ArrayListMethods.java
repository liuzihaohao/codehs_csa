import java.util.ArrayList;
public class ArrayListMethods
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(6);
        array.add(3);
        System.out.println("Starting Array:");
        printArray(array);
        
        array.add(0, 4);
        System.out.println("\nAdding a value at index 0:");
        printArray(array);
        
        array.set(1, 8);
        System.out.println("\nSetting value of index 1 to 8:");
        printArray(array);
        
        array.remove(2);
        System.out.println("\nRemoving index 2");
        printArray(array);
    }
    
    //Method to print out array values: 
    public static void printArray(ArrayList<Integer> array)
    {
        int size = array.size();
        System.out.print("Indices: ");
        for(int i = 0; i<size; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Values:  ");
        for(int elem: array)
        {
            System.out.print(elem + " ");
        }
        System.out.println("\nArray Size: " + size);
    }
}
