public class Person
{
    private String name;
    private int age;
    
    // Constructor
    public Person(String theName, int theAge)
    {
        name = theName;
        age = theAge;
    }
    
    
    // Returns a representation of this person
    public String toString()
    {
        return name;
    }
}
