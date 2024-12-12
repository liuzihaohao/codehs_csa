public class TrickyJava
{
    public static void main(String[] args)
    {
        int candyBars = 20;
        int friends = 5;
        
        System.out.print("Candy bars: ");
        System.out.println(candyBars);
        
        System.out.print("Friends: ");
        System.out.println(friends);
        
        int candyBarsPerPerson = candyBars / friends;
        // We expect it to be 4... and it is 4.
        System.out.print("Candy per person: ");
        System.out.println(candyBarsPerPerson);
        
        // Add 1 to friends
        friends = friends + 1;

        System.out.print("Candy bars: ");
        System.out.println(candyBars);
        System.out.print("Friends: ");
        System.out.println(friends);

        // We expect it to be 3.33.. and it is ... 3.
        // Tricky integer division.
        candyBarsPerPerson = candyBars / friends;
        System.out.print("Candy per person: ");
        System.out.println(candyBarsPerPerson);
        
    }
}