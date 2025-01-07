import java.util.ArrayList;

public class InsertElement
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        numList.add(6);
        numList.add(9);
        numList.add(12);
        System.out.println("Array:");
        printArray(numList);
        
        addElem(numList);
        
        System.out.println("\nArray after adding elements:");
        printArray(numList);
    }
    
    public static void addElem(ArrayList<Integer> list)
    {
        for(int index = 0; index < list.size(); index++)
        {
        	int elem = list.get(index);
        	//Condition for adding element
        	if(elem %2 == 1)
        	{
        	    list.add(index + 1, elem + 2);
        	    //Comment out the index++ to see what happens
        	    //Why do we need index++?
        	    index++;
            }
        }
    }
    
    public static void printArray(ArrayList<Integer> array)
    {
        for(Integer elem: array)
        {
            System.out.print(elem+ " ");
        }
        System.out.println();
    }

}
