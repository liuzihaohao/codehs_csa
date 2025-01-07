import java.util.ArrayList;

public class ArrayListTester
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();  
        list.add("I");
        list.add("am");
        list.add("Adam");
        list.add("Aardvark");
        
        System.out.println("Original ArrayList:");
        printArray(list);
        
        removeA(list);
        System.out.println("\nArrayList without A:");
        printArray(list);


    }
    
    public static void removeA(ArrayList<String> array)
    {
        for(int i = 0; i < array.size(); i++)
	    {
    		if (array.get(i).startsWith("A"))
    		{
    			array.remove(i);
    			/*This method currently causes an error because index directly following the 
    			removed index does not get tested. Uncomment out the i-- to get the program to work correctly!
    			*/
    			
    			//i--;
    		}
	    }
    }
    
    public static void printArray(ArrayList<String> array)
    {
        for(String elem: array)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    
      
}