public class MakeArray
{
    public static void main(String[] args)
    {
        // This declares an int array with default values
        int[] intArr = new int[5];
        
        // 0 is the default value for int arrays
        System.out.println(intArr[0]);
        System.out.println(intArr[3]);
        System.out.println(); 
        
        // This declares a String array with default values
        String[] stringArr = new String[4];
        
        // null is the default value for objects
        System.out.println(stringArr[0]);
        System.out.println(); 
        
        // This declares a double array with default values
        double[] doubleArr = new double[7];
        
        // 0.0 is the default value for double arrays
        System.out.println(doubleArr[0]);
        System.out.println(doubleArr[3]);
        System.out.println(); 
        
        // This declares a Boolean array with default values
        boolean[] booleanArr = new boolean[4];
        
        // false is the default value for boolean arrays
        System.out.println(booleanArr[0]);
        System.out.println(booleanArr[3]);
    }
}