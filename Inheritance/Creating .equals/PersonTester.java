import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the Person's name: ");
        String name=input.nextLine();
        
        System.out.print("Please enter the Person's birthday: ");
        String birthday=input.nextLine();
        
        Person a=new Person(name,birthday);
        
        System.out.print("Please enter the Student's name: ");
        String name2=input.nextLine();
        
        System.out.print("Please enter the Student's birthday: ");
        String birthday2=input.nextLine();
        
        System.out.print("Please enter the Student's grade: ");
        int grade=input.nextInt();
        
        Student b=new Student(name2,birthday2,grade);
        
        System.out.println("Same: "+a.equals(b));
        
        
    }
}