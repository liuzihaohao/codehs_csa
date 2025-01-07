public class StudentTester
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Isabella", "4/15/2005", 8, 4.0);
        Student student2 = new Student("Destiny", "7/7/2005", 8, 3.9);
        Student student3 = new Student("Isabella", "4/15/2005", 8, 4.0);
        
        System.out.println("Student 1 = Student 2? " + student1.equals(student2));
        System.out.println("Student 1 = Student 3? " + student1.equals(student3));
    }
}