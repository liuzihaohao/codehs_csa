public class PersonTester {

    public static void main(String[] args) {
        
        Person myPerson = new Person("Tyler", "11/12/1999");
        Student myStudent = new Student("Emma", "7/18/2004", 11, 3.9);
        
        /**
         * With the student, we have access to methods from the 
         * Person class and the Student class.
         */
         
        System.out.println("Student Name: " + myStudent.getName());
        System.out.println("Grade: " + myStudent.getGrade());
        
        /**
         * With the person, we only have access to methods from 
         * the Person class.
         */
         
        System.out.println("Person Name: " + myPerson.getName());
    }
}