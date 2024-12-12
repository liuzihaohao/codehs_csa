public class Executable
{
    // Instance variables
    private String name;
    private int numLines;
    
    // Constructor
    public Executable(String programName)
    {
        System.out.println("Creating a program!");
        name = programName;
    }
    
    // Instance Method
    // Increases numLines everytime a statement is executed
    public void executeStatement()
    {
        System.out.print(name);
        System.out.println(" is executing a statement!");
        
        numLines++;
    }
    
    // Print the number of lines executed
    public void printProgress()
    {
        System.out.print(name);
        System.out.print(" has successfully executed " );
        System.out.print(numLines);
        System.out.println(" lines of code!");
    }
}
