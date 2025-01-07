// Import the ArrayList
import java.util.ArrayList;

public class ListsAndPrimitives
{
	public static void main(String[] args)
	{
        // Feel free to comment this out and test the incorrect code.
		ArrayList<Integer> myList = new ArrayList<Integer>();
        
        // Uncomment below to see the error.
 		// ArrayList<int> myList = new ArrayList<int>();
		
		//ArrayLists automatically use the Wrapper class to convert int to Integer
        // Add the element 100 to our list 		
		myList.add(100);
		// Add the element 200 to our list
		myList.add(200);
		
		//When getting values, Integer is then converted to int
        // Print the element at index 0 of our list: 100
		System.out.println(myList.get(0));
		// Print the element at index 1 of our list: 200
		System.out.println(myList.get(1));
	}
}
