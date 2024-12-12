public class GrilledCheeseTester
{
    public static void main(String[] args)
    {
        // Create a default Grilled Cheese
        GrilledCheese plain = new GrilledCheese();
        System.out.println(plain);
        
        
        // Customized ingredient GrilledCheese
        // Grilled Cheese on wheat with brie cheese
        GrilledCheese fancy = new GrilledCheese("wheat", "brie");
        System.out.println(fancy);
        
        // Custom cooked GrilledCheese
        // GrilledCheese on white bread with cheddar (by default)
        // Cooked at 400 degrees F (!!!)
        GrilledCheese burned = new GrilledCheese(400);
        System.out.println(burned);
        
        
        // Completely custom GrilledCheese
        // GrilledCheese on rye bread with cottage cheese cooked at 90.5 degrees F
        GrilledCheese specialOrder = new GrilledCheese("rye", "cottage cheese", 90.5);
        System.out.println(specialOrder);
        
        
        // What happens if you print the objects again?
        // Did any of their instance variable values change because of the other
        // objects?
    }
}
