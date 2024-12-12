public class Salutations
{
    private String name;
    
    public Salutations(String namea){
        name=namea;
    }
    
    public void addressLetter(){
        System.out.println("Dear "+name);
    }
    
    public void signLetter(){
        System.out.println("Sincerely,\n"+name);
    }
    
    public void addressMemo(){
        System.out.println("To whom it may concern");
    }
    
    public void signMemo(){
        System.out.println("Best,\n"+name);
    }
}