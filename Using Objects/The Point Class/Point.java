/**
 * The Point class keeps track of a point on
 * a coordinate plane. Each Point has
 * an x and y coordinate.
 */
public class Point
{
    // Attributes
    private int x;
    private int y;
    
    // Constructor
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    // Lets us print Points
    public String toString()
    {
        return x + ", " + y;
    }
}