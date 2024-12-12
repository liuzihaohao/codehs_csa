public class MyProgram
{
    public static void main(String[] args)
    {
       String allLetters = "The quick brown fox jumped over the lazy dog";
       
       System.out.println(allLetters);
       
       // Includes character at index 4
       // Excludes character at index 9
       String quick = allLetters.substring(4, 9);
       System.out.println(quick);
       
       // Get from index 36 to the end
       String dog = allLetters.substring(36);
       System.out.println(dog);
       
       // Get the last three letters
       int length = allLetters.length();
       String lastThree = allLetters.substring(length-3);
       System.out.println(lastThree);
       
    }
}