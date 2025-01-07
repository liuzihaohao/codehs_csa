public class Dog extends Animal {

    public Dog () {
        super("Dog", "Bark");
    }

    /**
     * We create a custom method in the dog
     * class that calls the speak method in the 
     * superclass.
     */
     
    public void bark(int number)
    {
        super.speak(number);
    }
}
