public class IndexingArray
{
    public static void main(String[] args)
    {
        /****** MAKE AN INT ARRAY WITH 10 SLOTS ******/
        int[] intArr = new int[10];
        
        // Set the values at indices 2 and 3
        intArr[2] = 10;
        intArr[3] = -12;
        
        // Get the value at index 2 and print it out
        System.out.println(intArr[2]);
        
        // The value at index 9 was never set, so the default value of 0 is printed
        System.out.println(intArr[9]);
        System.out.println(); 
        
        // Accessing beyond the index produces an error
        // Uncommenting the line below will produce an ArrayIndexOutOfBoundsException
        // System.out.println(intArr[10]);
        
        /****** MAKE A DOUBLE ARRAY WITH 10 SLOTS ******/
        double[] doubleArr= new double[10];
        
        // Set the values at indices 0 and 9
        doubleArr[0] = -9.8;
        doubleArr[9] = 0.4567;
        
        // Get the value at index 0 and print it out
        System.out.println(doubleArr[0]);
        
        // The value at index 1 was never set, so the default value of 0.0 is printed
        System.out.println(doubleArr[1]);
        System.out.println(); 
        
        /******* MAKE A STRING ARRAY WITH 20 SLOTS  ******/
        String[] stringArr = new String[20];
        
        // Set the values at indices 2 and 15
        stringArr[2] = "hello";
        stringArr[15] = new String("world");
        
        // Get the value at index 2 and 15 and print them out 
        System.out.println(stringArr[2]);
        System.out.println(stringArr[15]);
        
        // The value at index 17 was never set, so the default value of null is printed
        System.out.println(stringArr[17]);
        System.out.println(); 
      
        /******* MAKE A BOOLEAN ARRAY WITH 12 SLOTS  ******/
        boolean[] booleanArr = new boolean[12];
        
        // Set the values at indices 5 and 0
        booleanArr[5] = true;
        booleanArr[0] = false;
        
        // Get the values at indices 5 and 0 and print them out
        System.out.println(booleanArr[5]);
        System.out.println(booleanArr[0]);
        
        // The value at index 1 was never set, so the default value of false is printed
        System.out.println(booleanArr[1]);
    }
}