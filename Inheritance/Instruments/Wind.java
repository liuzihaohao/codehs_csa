public class Wind extends Instrument
{
    private boolean reed;
    public Wind(String name,String b,boolean reed){
        super(name,b);
        this.reed=reed;
    }
      
      public boolean getReed(){
          return reed;
      }
      public void setReed(boolean box){
          this.reed=reed;
      }
}