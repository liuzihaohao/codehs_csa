import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
   public void addContact(Contact tmp){
       contacts.add(tmp);
       sort();
   }
   
   public void sort(){
       Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact p1, Contact p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
   }
   public void printPhonebook(){
       for(Contact i:contacts){
           System.out.println(i.getName());
       }
   }
}