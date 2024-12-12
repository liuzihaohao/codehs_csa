import java.util.Scanner;

public class ReplaceChars 
{
  // This program replaces all vowels in a word with a star *
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    String originalString = str;

    // Iterate through the entire string with a for loop 
    // looking for the vowels
    for (int i = 0; i < str.length(); i++) 
    {
      char c = str.charAt(i);
      if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
          || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
        String front = str.substring(0, i);
        String back = str.substring(i + 1);
        str = front + "*" + back;
      }
    }
    System.out.println(originalString);
    
    // Print the new string with the vowels replaced with *s
    System.out.println(str);
  }
}
