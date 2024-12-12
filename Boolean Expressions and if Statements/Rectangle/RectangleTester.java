public class RectangleTester
{
    public static void main(String[] args)
    {
        // Create Rectangle objects
        Rectangle lunchBox = new Rectangle(8, 8);
        Rectangle pencilBox = new Rectangle(3, 10);
        
        System.out.println("lunchBox: " + lunchBox);
        System.out.println("pencilBox: " + pencilBox);
        
        // Check if they're squares
        System.out.println("\nLunchbox is square: " + lunchBox.isSquare());
        System.out.println("PencilBox is square: " + pencilBox.isSquare());
        
        // Try to set width to negative number
        if(pencilBox.setWidth(-10))
        {
            System.out.println("Successfully updated width");
        }
        
        // Set height
        if(pencilBox.setHeight(4))
        {
            System.out.println("Successfully updated height");
        }
        
        
        // Print out final state of objects
        System.out.println("\nlunchBox: " + lunchBox);
        System.out.println("pencilBox: " + pencilBox);
    }
}
