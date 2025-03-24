public class TShirt extends Clothing
{
    private String farbric;
    public String getFabric(){
        return farbric;
        
    }
    public TShirt(String a,String b,String c){
        super(a,b);
        farbric=c;
    }
}