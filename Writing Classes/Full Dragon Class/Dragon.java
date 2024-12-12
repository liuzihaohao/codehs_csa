public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int a,String b){
        attack=b;
        level=a;
    }
    // Put getters here
    public String fight(){
        String res="";
    
        for(int i=0;i<level;i++){
            res+=attack;
        }
        return res;
    }
    // Put other methods here
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
    
    public String getAttack(){
        return attack;
    }
    public int getLevel(){
        return level;
    }
}