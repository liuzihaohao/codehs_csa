public class PersonRunner
{
    public static void main(String[] args){
        Person person = new Person("Wolfgang Amadeus Mozart", " January 27, 1756");
        Student student = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);
        System.out.println(person.getName());
        System.out.println(student.getName());
        System.out.println(person.getBirthday());
        System.out.println(student.getBirthday());
        System.out.println(student.getGrade());
        System.out.println(student.getGrade());
    }
}