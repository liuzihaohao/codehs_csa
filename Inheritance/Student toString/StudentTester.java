public class StudentTester {

    public static void main(String[] args) {
        
        Person ryan = new Person("Ryan", "2/2/1990");
        Student emma = new Student("Emma", "7/18/2004", 11, 3.9);
         
        /**
         * Ryan is a Person object, so it will print from the
         * Person toString.
         */
        System.out.println(ryan);
        
        /**
         * Emma is a Student object, so it will print from the
         * Student toString.
         */
        System.out.println(emma);
        
    }
}