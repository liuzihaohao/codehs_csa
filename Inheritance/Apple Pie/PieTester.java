public class PieTester
{
    public static void main(String[] args)
    {
        Pie pumpkin = new Pie("Pumpkin", 4);
        
        System.out.println("Pumpkin slices remaining: " + pumpkin.getSlices());
        
        // Eat 5 slices
        
        for (int i = 0; i < 5; i++) {
            pumpkin.eatSlice();
        }
        
        // The Pie class doesn't have a check to avoid negative 
        System.out.println("Pumpkin slices remaining: " + pumpkin.getSlices());
        
        ApplePie homemade = new ApplePie(6);
        
        System.out.println("Apple slices remaining: " + homemade.getSlices());
        
        // Eat 8 slices
        for (int i = 0; i < 8; i++) {
            homemade.eatSlice();
        }
        
        // The ApplePie class checks before eating.
        System.out.println("Apple slices remaining: " + homemade.getSlices());
    }
}