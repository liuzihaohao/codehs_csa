public class TextBook extends Book
{

    // Start here!
    
    private int edition;
    private boolean isEbook;
    
    public TextBook(String title, String author, int edition, boolean isEbook){
        super(title,author);
        this.edition=edition;
        this.isEbook=isEbook;
    }

    public String toString(){
        return "Textbook edition # "+this.edition;
    }
    
    public int getEdition(){
        return edition;
    }
    
    public boolean isEbook(){
        return isEbook;
    }
}