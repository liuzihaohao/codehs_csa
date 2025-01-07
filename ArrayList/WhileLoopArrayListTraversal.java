import java.util.ArrayList;
public class WhileLoopArray
{
    public static void main(String[] args)
    {
        //Create new String ArrayList
        ArrayList<String> pyramid = new ArrayList<String>();
        pyramid.add("*");
        pyramid.add("**");
        pyramid.add("***");
        pyramid.add("****");
        pyramid.add("***");
        pyramid.add("**");
        pyramid.add("*");
        
        //Create counter to traverse array
        int index = 0;
        while(index < pyramid.size())
        {
            System.out.println("Value at Index " + index +":");
            System.out.println(pyramid.get(index));
            //increase value of index to get new value
            index++;
        }
    }
}
