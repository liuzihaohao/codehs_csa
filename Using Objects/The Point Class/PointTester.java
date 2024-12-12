public class PointTester
{
    public static void main(String[] args)
    {
        // Create a point
        Point p = new Point(10, 5);
        System.out.println(p);
        
        
        // Create a different point
        Point origin = new Point(0,0);
        System.out.println(origin);
        
        // Create yet another point
        Point homebase = new Point(-15, 10);
        System.out.println(homebase);
        
        
        // Print all points again
        System.out.println();
        System.out.println("All of the points we created");
        System.out.println("Notice every object has its own copy of the attributes");
        System.out.println("called instance variables.");
        System.out.println("Creating new objects doesn't change");
        System.out.println("the values of previous objects!");
        System.out.println();
        
        System.out.print("Point p: ");
        System.out.println(p);
        
        
        System.out.print("Point origin: ");
        System.out.println(origin);
        
        
        System.out.print("Point homebase: ");
        System.out.println(homebase);
        
    }
}