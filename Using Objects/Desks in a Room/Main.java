public class Main
{
    public static void main(String[] args)
    {
        //step 1: find the total area of the space
        int totalArea = 200 * 114;
        
        //step 2: find the area of a desk
        Rectangle desk = new Rectangle(13, 7);
        int deskArea = desk.getArea();
        
        //step 3: divide the area of space by the area of a desk
        int numDesks = totalArea / deskArea;
        
        //step 4: print out the number of desks!
        System.out.println(numDesks);

    }
}
