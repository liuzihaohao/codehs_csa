import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        
        ArrayList<Book> list=new ArrayList<Book>();
        
        for(int i=0;i<9;i++){
        list.add(new TextBook("a","a",4,true));
        list.add(new Novel("a","a",4,"a"));
        }
        
        for(Book i:list){
            System.out.println(i);
        }
    }
}