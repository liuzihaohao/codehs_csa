import java.util.Scanner;

public class RandomRange
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            
            // Get the maximum allowable value
            System.out.println("Enter a maximum value: ");
            int maxValue = input.nextInt();
            
            // Get a random number in the range (0,1)
            double randDouble = Math.random();
            // Multiply by the maximum value + 1
            // This gives us a double between 0 and maxValue + 1 EXCLUSIVE
            double multiplyByRange = randDouble * (maxValue + 1);
            // Turn into an integer between 0 and maxValue + 1 EXCLUSIVE
            int randNum = (int)(multiplyByRange);
            
            System.out.println("Initial random num: "+ randDouble);
            System.out.println("Random num multiplied by range: " + multiplyByRange);
            System.out.println("Random num cast to integer: " + randNum);
            
    }
}
