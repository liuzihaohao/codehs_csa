public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        // Your code goes here! 
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}