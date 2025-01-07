public class StudentAthlete extends Student
{
    private String sport;
    private String level;
    
   // Add the constructor here
   
   
   public String getSport(){
       return sport;
   }
   
   public String getLevel(){
       return level;
   }
   
   
    @Override
    public String toString(){
        return super.toString() + " plays " + sport;
    }
}
