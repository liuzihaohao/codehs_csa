import java.util.ArrayList;

public class ArraysvArrayLists
{
    public static void main(String[] args)
    {
     //Arrays and ArrayLists have different methods for altering data:
        
        //Creating:
        String[] arr = new String[4];
        ArrayList<String> array = new ArrayList<String>();
        
        //Adding a value:
        array.add("This ");
        arr[0] = "This ";
        array.add("Is ");
        arr[1]= "Is ";
        array.add("An ");
        arr[2] = "An ";
        array.add("Array");
        arr[3] = "Array ";
        
        //Set the value of an ArrayList:
        array.set(3, "ArrayList");
        
        
        
        //Finding the size:
        System.out.println("Array length: " + arr.length);
        System.out.println("ArrayList size: " + array.size());
        
        //Accessing a value:
        System.out.println("\nType: " + arr[3]);
        System.out.println("Type: " + array.get(3));
        
    }
}