public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String a,int b){
        name=a;
        level=b;
        canBreatheFire=(b>=70);
    }
    
    
    // Put getters here
    public String getName(){
        return name;
    }public int getLevel(){
        return level;
    }public boolean isFireBreather(){
        return canBreatheFire;
    }
    
    // Put other methods here
    public void gainExperience(){
        level+=10;
        canBreatheFire=(level>=70);
    }
    
    public void attack(){
        if(!canBreatheFire){
            System.out.println("~ ~ ~");
            return;
        }
        System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}