import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(useProperGrammar(scanner.nextLine()));
    }
    
    public static String useProperGrammar(String theText)
    {
        int count=0;
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String res="";
        for(int i=0;i<theText.length();i++){
            if(theText.charAt(i)=='2'){
                res+="to";count++;
            }else{
                res+=theText.charAt(i);
            }
        }
        System.out.println("Fixed "+count+" grammatical errors:");
        return res;
    }
}