public class SumArray
{
    public static void main(String[] args) {
        int[] myNums = {1, 2, 3, 4, 5};
        
        System.out.println(sumArray(myNums, myNums.length-1));
    }
    
    public static int sumArray(int[] nums, int index){
    
        // Base Case
        if (index < 0) {
            return 0;
        }
        
        // Recursive Call
        return nums[index] + sumArray(nums, index - 1);
    }

}
