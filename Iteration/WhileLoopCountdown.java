public class WhileLoopCountdown
{
    public static void main(String[] args)
    {
        //Inititalize variable OUTSIDE the while loop
        int i = 10;
        
        //Check condition of variable and while it is true, print i and then decrement (count down) i
        while(i >= 0)
        {
            System.out.println(i);
            i--;
        }
    }
}