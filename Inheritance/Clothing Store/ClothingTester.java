public class ClothingTester
{
    public static void main(String[] args)
    {
        // Start here!
        Clothing b= new Clothing("a","b");
        System.out.println(b.getSize());
        Jeans jean1 = new Jeans("Medium");
        TShirt tshirt1 = new TShirt("Large", "Green", "Cotton");
        Sweatshirt sweatShirt = new Sweatshirt("Extra Large", "Yellow", true);
        Jeans jean2 = new Jeans("Small");
        System.out.println( jean1.getSize() +  jean1.getColor());
        System.out.println( tshirt1.getSize() +  tshirt1.getColor() +  tshirt1.getFabric());
        System.out.println( sweatShirt.getSize() +  sweatShirt.getColor() +  sweatShirt.hasHood() + " that it has a hood");
        System.out.println( jean2.getSize() +  jean2.getColor());
    }
}