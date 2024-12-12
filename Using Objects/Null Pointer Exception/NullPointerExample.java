public class NullPointerExample 
{
    
    public static void main(String[] args)
    {
    
        // Declare our variables
        Person realPerson;
        Person ghost;
    
        // Initialize realPerson
        realPerson = new Person("Mike", 45);
        System.out.println(realPerson);
        
        // Initialize to a new Person, get a new memory address
        realPerson = new Person("Michael", 45);
        System.out.println(realPerson);
        
        // ghost is never initialized, so there is no
        // memory address to point to.
        // Instead, the value held in the variable is null
        System.out.println(ghost);
        
    }
}
