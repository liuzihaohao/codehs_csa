import java.util.ArrayList;
public class TraversingSimultaneousArrays
{
    public static void main(String[] args)
    {
        //Create ArrayLists
        ArrayList<Integer> sum1 = new ArrayList<Integer>();
        sum1.add(5);
        sum1.add(2);
        sum1.add(4);
        sum1.add(5);
        sum1.add(0);
        ArrayList<Integer> sum2 = new ArrayList<Integer>();
        sum2.add(3);
        sum2.add(5);
        sum2.add(6);
        sum2.add(9);
        sum2.add(12);
        System.out.println("Array 1:");
        printArray(sum1);
        System.out.println("Array 2:");
        printArray(sum2);
        
        //Initialize summed to sumArrays(sum1, sum2)
        ArrayList<Integer> summed = sumArrays(sum1, sum2);
        System.out.println("\nSum of Array 1 and Array 2:");
        printArray(summed);
    }
    
    public static ArrayList<Integer> sumArrays(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> summedList = new ArrayList<Integer>();
        for(int index = 0; index < list1.size(); index++)
        	{
        	    //We can traverse multiple ArrayLists simultaneously
        		int sum = list1.get(index) + list2.get(index);
        		summedList.add(sum);
        	}
        return summedList;
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
