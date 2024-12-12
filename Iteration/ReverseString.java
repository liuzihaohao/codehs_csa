class Reverse
{
    public static void main(String[] arg)
    {
        String original = "Let's reverse this string!";
        System.out.println(original);
        
        String newString = "";
        for(int i = original.length() - 1; i >= 0; i--)
        {
            String character = original.substring(i, i+1);
            newString += character;
        }
        System.out.println("The original string reversed = " + newString);
    }
}
