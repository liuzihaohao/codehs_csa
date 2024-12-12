public class Duplicates
{
    public static void main(String[] args)
    {
        // Try changing the values so there are no duplicates
        int[] numbers = {1, 2, 3, 3, 4, 5};
        boolean hasDuplicate = false;
        
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    hasDuplicate = true;
                }
            }
        }
        
        System.out.print("Has Duplicate: ");
        System.out.println(hasDuplicate);
    }
}