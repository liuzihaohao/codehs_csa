public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    
    public Pinata(String a,String b,String c){
        candy=a;
        color=b;
        shape=c;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    
    public Pinata(String a,String b){
        color=a;
        shape=b;
        candy="hard candy";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    
    public Pinata(String a){
        candy=a;
        shape="donkey";
        color="rainbow";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}