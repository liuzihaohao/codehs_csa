public class Novel extends Book
{
    
    // Start here!
    
    private int readingLevel;
    private String genre;
    
    public Novel(String title, String author, int readingLevel, String genre){
        super(title,author);
        this.readingLevel=readingLevel;
        this.genre=genre;
    }
    
    public String toString(){
        return genre+" Novel";
    }
    
    public String getGenre(){
        return genre;
    }
    public int getReadingLevel(){
        return readingLevel;
    }
}