public class Final
{
    public static void main(String[] args)
    {
        // We can use final to make sure variables don't change value
        final int wontChange = 10;
        //When we try to change the value of wontChange
        //it throws an error!
        wontChange = 5;
        //delete line 9 and the program will work!
        System.out.println(wontChange);
    }
}
