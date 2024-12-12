public class StudentTester 
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11);
        alan.setGPA(3.5);
        alan.setGradeLevel(12);
        
        System.out.println(alan.getFirstName());
        System.out.println(alan.getGPA());
        System.out.println(alan.getGradeLevel());
        
        Student ada = new Student("Ada", "Livelace", 12);
        
        System.out.print(ada.getFirstName() + " ");
        System.out.println(ada.getLastName());
        ada.setLastName("Lovelace");
        
        System.out.println(alan);
        System.out.println(ada);
    }
}
