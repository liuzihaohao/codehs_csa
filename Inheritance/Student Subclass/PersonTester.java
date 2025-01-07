public class PersonTester {

    public static void main(String[] args) {
        
        /**
         * The Student subclass constructor takes all the information
         * for both the Student object and the Person object
         */
         
        Student jackson = new Student("Jackson", "11/21/2003", 12, 3.6);
        Student emma = new Student("Emma", "7/18/2004", 11, 3.9);
         
        System.out.println("Student Name: " + jackson.getName());
        System.out.println("Grade: " + jackson.getGrade());
        
        System.out.println("Student Name: " + emma.getName());
        System.out.println("Grade: " + emma.getGrade());
        
    }
}
