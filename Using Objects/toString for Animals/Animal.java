public class Animal
{
    private String commonName;
    private String habitat;
    private String diet;
    private int typicalAge;
    
    
    public Animal(String name, String animalHabitat, String animalDiet, int age)
    {
        commonName = name;
        habitat = animalHabitat;
        diet = animalDiet;
        typicalAge = age;
    }
    
    public String toString()
    {
        return "".format("%s lives in %s, eats %s and usually lives %d years.",
        commonName,
        habitat,
        diet,
        typicalAge
        );
    }
}