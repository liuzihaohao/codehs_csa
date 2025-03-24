import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Assignment> ass = new ArrayList<Assignment>();
        // Start here
        while(true){
    System.out.print("Enter the assignment's name (exit to quit): ");
    String a=scanner.nextLine();
    if(a.equals("exit")){
        break;
    }
    System.out.print("Enter the due date: ");
    String b=scanner.nextLine();
    System.out.print("How many points is the assignment worth? ");
    int c=scanner.nextInt();
    scanner.nextLine();
    System.out.print("How many points were earned? ");
    int d=scanner.nextInt();
    scanner.nextLine();
    System.out.print("Is this a (T)est or a (P)roject? ");
    String e=scanner.nextLine();
    if(e.equals("T")){
        System.out.print("What type of test is it? ");
        String f=scanner.nextLine();
        ass.add(new Test(a,b,c,d,f));
    }else{
        System.out.println("Does this project require (true/false) ... ");
        System.out.print("Groups? ");
        boolean f=scanner.nextLine().equals("true");
        System.out.print("A presentation? ");
        boolean g=scanner.nextLine().equals("true");
        ass.add(new Project(a,b,c,d,f,g));
    }    
    System.out.println();
    }
    printSummary(ass);
    }
    
    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
       for(Assignment i:assignments){
           System.out.println(i.getName()+" - "+(i.getEarnedPoints()/i.getAvailablePoints()*100));
       }
       
    }
}