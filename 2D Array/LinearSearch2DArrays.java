public class LinearSearch
{
    public static void main(String[] args)
    {
        String[][] guessList = {{"Ben", "Kevin", "Sam", "Alice"},{"Stan", "Kelly", "Jen", "Lola"},{"Haley", "Jim", "Kyle", "Abby"}};
        System.out.println(search(guessList, "Alice"));
        System.out.println(search(guessList, "Kyle"));
        System.out.println(search(guessList, "Rex"));


    }
    
    public static String search(String[][] array2D, String key)
    {
        for(int rowIndex = 0; rowIndex < array2D.length; rowIndex++)
        {
            for(int colIndex = 0; colIndex < array2D[rowIndex].length; colIndex++)
            {
                if(array2D[rowIndex][colIndex].equals(key)) 
                {
                	return key + " is located in Array: " + rowIndex + ", Index: " + colIndex;
                }
            }
        }
        return key + " is not in this 2D array.";
    }


}