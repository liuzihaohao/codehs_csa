public class PersonTester {

    public static void main(String[] args) {
        
        Person myPerson = new Person("Tyler", "11/12/1999");
        HighSchoolStudent myStudent = new HighSchoolStudent("Emma", "7/18/2004", 11, 3.9, 65);
        
        //From Person class 
        System.out.println("Student Name: " + myStudent.getName());
        
        //From Student class
        System.out.println("Grade: " + myStudent.getGrade());
        
        //From HighSchoolStudent class
        System.out.println("Serveice Hours Completed: " 
            + myStudent.getServiceHours());
        
        
        /**
         * With the person, we only have access to methods from 
         * the Person class.
         */
         
        System.out.println("Person Name: " + myPerson.getName());
    }
}