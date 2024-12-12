public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
        
    }
    
    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int ans=0;
        for(int i=0;i<array[row].length;i++){
            ans+=array[row][i];
        }
        return ans;
    }
    
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int ans=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                ans+=array[i][j];
            }
        }
        return ans;
    }
}