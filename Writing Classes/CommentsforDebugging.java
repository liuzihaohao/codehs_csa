public class DebugComments
{
    public static void main(String[] args)
    {
        //Run this code before changing anything!
        System.out.println("We can use comments to debug programs!");
        brokenMethod();
        System.out.println("This message will run once brokenMethod is commented out!");
        
    }
    
    
    public static void brokenMethod()
    {
        /*Commenting out the code in this method will stop it from being run.
        This can be used to help debug programs!
        Comment out Line 18 in order to get this program to run*/
        string string = "This is an error!";
    }
}