import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner scanner = new Scanner(System.in);
        System.out.println(passwordCheck(scanner.nextLine()));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        if(password.length()<8){
            return false;
        }
        for(int i=0;i<password.length();i++){
            char tmp=password.charAt(i);
            if(('A'<=tmp&&tmp<='Z')||('a'<=tmp&&tmp<='z')||('0'<=tmp&&tmp<='9')){
                
            }else{
                return false;
            }
        }
        return true;
    }
}