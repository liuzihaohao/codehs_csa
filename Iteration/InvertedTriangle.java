public class InvertedTriangle
{
    public static void main(String[] args)
    {  
       // Call makeInvertedTriangle 
       makeInvertedTriangle();
    }
     
    // Makes an inverted triangle with stars
    public static void makeInvertedTriangle()
    {
        for(int i = 0;i <= 6 ; i++)
        {
            // We can manipulate the boolean condition to change each iteration 
            //In this case, each time the outer loop iterates, j < 7 - i decreases by one
            for(int j = 1;j <= 7 - i; j++)
            {
                System.out.print("*");
            }
        System.out.println("");
        } 
    }
}
