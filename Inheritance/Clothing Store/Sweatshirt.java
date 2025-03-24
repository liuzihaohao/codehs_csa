public class Sweatshirt extends Clothing
{

private boolean hashood;
public boolean hasHood(){
    return hashood;
}
public Sweatshirt(String a,String b,boolean c){
    super(a,b);
    hashood=c;
}
}