public class StudentTester 
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11);
        System.out.println("Default GPA: " + alan.getGPA());
        alan.setGPA(3.5);
        System.out.println("Updated GPA: " + alan.getGPA());
        alan.setGradeLevel(12);
        
        System.out.println(alan.getFirstName());
        
        System.out.println(alan.getGradeLevel());
        
        Student ada = new Student("Ada", "Livelace", 12, 4.0);
        
        System.out.print(ada.getFirstName() + " ");
        System.out.println(ada.getLastName());
        System.out.println("GPA: " + ada.getGPA());
        ada.setLastName("Lovelace");
        
        System.out.println(alan);
        System.out.println(ada);
    }
}