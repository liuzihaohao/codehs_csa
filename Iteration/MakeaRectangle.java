public class RectangleOfStars
{
    public static void main(String[] args)
    {  
       // Call makeARectangle to produce a rectangle of stars *
       makeARectangle();
    }
       
    //Makes a rectangle of stars
    public static void makeARectangle()
    {
        // the outer loop represents the total number of rows
       for (int row = 0; row < 3; row++)
       {
           // the inner loop represents the total number of columns per row
           for (int col = 0; col < 5; col++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}      
