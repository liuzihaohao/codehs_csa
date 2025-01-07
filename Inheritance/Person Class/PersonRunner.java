public class PersonRunner {
    
    public static void main(String[] args) 
    {
        Person jobs = new Person("Steve");
        Person lovelace = new Student("Ada", 12);
        Person turing = new Worker("Alan", 50000);

        greeting(jobs);
        greeting(lovelace);
        greeting(turing);
    }
    
    /**
     * In this example, we are using the generic
     * superclass as a formal parameter.
     * This allows us to pass any object 
     * declared as a Person into the method.
     */
    
    private static void greeting(Person person){
        System.out.println("Hello " + person.getName());
    }
}
