public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        
        /**
         * We can now create an animal array and add
         * any object that has been declared as an
         * animal, regardless of how it is instantiated.
         */
         
        Animal[] animals = {dog, cow, pig};
        
        for (Animal animal : animals){
            animal.talk();
        }
    }
}
