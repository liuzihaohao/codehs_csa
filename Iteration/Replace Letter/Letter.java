import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println("Enter a word: ");
        String a=scanner.nextLine();
        System.out.println("Enter the letter to be replaced: ");
        String b=scanner.nextLine();
        System.out.println("Enter the new letter: ");
        String c=scanner.nextLine();
        System.out.print("\nResult: "+replaceLetter(a,b,c));
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String a_tmp,String b_tmp)
    {
        char a=a_tmp.charAt(0);
        char b=b_tmp.charAt(0);
        char[] ab=word.toCharArray();
        boolean flag=false;
        for(int i=0;i<ab.length;i++){
            if(ab[i]==a){
                if(flag){
                    
                    ab[i]=b;
                }
                flag=true;
            }
        }
        String aaab="";
        for(int i=0;i<ab.length;i++){
            aaab+=ab[i];
        }
        return aaab;
    }
}