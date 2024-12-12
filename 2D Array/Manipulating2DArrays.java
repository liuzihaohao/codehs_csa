public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};
        
        // Call the updateValue method three times on this array:
        
        
        
        int [][] array2 = {{3, 5, 7, 8, 3}, {500, 250, 125, 784, 267, 674, 15}, {9, 8, 3}};
        
        
        print(array2);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col]=value;
    }
    
    
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}