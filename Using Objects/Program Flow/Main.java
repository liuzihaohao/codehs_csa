public class Main
{
    public static void main(String[] args)
    {
        // This program shows exactly how the statements in a
        // program are executed
        // Run this program 
        // Then carefully examine the output to see what lines
        // were printed and where they came from!
        
        System.out.println("Beginning main method");
        
        Executable prog = new Executable("tracer");
        
        System.out.println("Back in main after creating an object");
        
        prog.executeStatement();
        System.out.println("Back in main");
        prog.executeStatement();
        System.out.println("And back in main yet again");
        
        prog.printProgress();
        
        System.out.println("Ending main method");
        
    }
}
