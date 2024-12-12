public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String a,String b,boolean c){
        name=a;
        breed=b;
        hasShots=c;
    }
    
    public Dog(String a,String b){
        name=a;
        breed=b;
        hasShots=false;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}