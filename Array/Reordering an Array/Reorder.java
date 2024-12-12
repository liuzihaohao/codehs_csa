public class Reorder
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] temp = new int[numbers.length]; //Create default array
        
        //Loop, but stop at the last element (edge case)
        for (int i = 0; i < numbers.length - 1; i++){
                temp[i + 1] = numbers[i]; 
        }
            
        temp[0] = numbers[numbers.length - 1]; //Edge case
        numbers = temp; //Copy over to the original array
        
        for (int i = 0; i < numbers.length; i++){
             System.out.print(numbers[i] + " ");
        }

    }
}