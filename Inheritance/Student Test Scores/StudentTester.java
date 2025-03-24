import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        // Prompt the user for name, test scores, and service hours
        System.out.println("Please enter the student name:");
        String a=input.nextLine();
        
        System.out.println("Please enter the Math Score:");
        int mathScore=input.nextInt();
        
        System.out.println("Please enter the ELA Score: ");
        int elaScore=input.nextInt();
        
        System.out.println("Please enter the Service Hours: ");
        int serviceHours=input.nextInt();
        
        // Create a HSStudent object
        HSStudent tmp=new HSStudent(a,mathScore,elaScore,serviceHours);
        
        // Print the results
        
        // System.out.println(tmp);
        System.out.println("Pass Math? " + tmp.passMath());
       System.out.println("Pass ELA? " + tmp.passEla());
      System.out.println("Completed Service Hours? " + tmp.completeService());
      System.out.println(tmp);
    }
}