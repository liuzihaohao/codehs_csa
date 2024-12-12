public class Main
{
    public static void main(String[] args)
    {
        // Create a String
        String stats = "Health: 100";
        System.out.println("Newly created: " + stats);
        
        // This line does nothing
        // In fact, it throws an error
        // Concatenation creates a NEW String
        // You have to store the new String
        
        stats + "\n" + "Speed: 75"; // comment or delete this line to fix the error
        
        // This line updates stats to 
        // refer to the new String
        stats += "\n" + "Speed: 75";
        
        // The \n before Updated adds an extra
        // line between the last print statement
        // and this one
        System.out.println("\nUpdated: ");
        System.out.println(stats);
        
        // You don't have to separate the 
        // escape characters
        stats += "\nPower: 94";
        
        // Note there is no space between \n and Combining
        // A space would put a space as the first
        // character of the line before Combining
        System.out.println("\nCombining escape characters: ");
        System.out.println(stats);
        
        
        // What if we wanted Power to be 96?
        // We can't modify the string
        // Have to create a new one entirely
        // This one creates the entire string all at once
        stats = "Health: 100\nSpeed: 75\nPower: 96";
        System.out.println(); // print a blank line
        System.out.println(stats);
    }
}
