public class PersonTester {

    public static void main(String[] args) {
        
    Person jobs = new Person("Steve");
    Person lovelace = new Student("Ada", 12);
    
    // Since both of these are declared as Person types,
    // Java checks to see if a printName method exists.
    jobs.printName();
    lovelace.printName();

    }
}