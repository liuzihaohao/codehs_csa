import java.util.Scanner;
public class GradeRange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What was your grade? ");
        int grade = input.nextInt();
        
        // Check if the grade is greater than or equal to 90
	    boolean gotA = grade >= 90;
	    System.out.println("Got an A: " + gotA);  
    }
}
