public class Book
{

    // Start here!
    
    private String title;
    private String author;
    
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    
    public String toString(){
        return "Book: "+this.title;
    }
    
    public String getTitle(){
        return title;
    }
}