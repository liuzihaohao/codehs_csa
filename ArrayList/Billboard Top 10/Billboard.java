import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
 
public void add(Musician tmp){
    if(tmp.getIsPlatinum()){
        if(top10.size()<10){
            top10.add(tmp);
        }else{
            replace(tmp);
        }
    }else{
        System.out.println("Sorry, "+tmp.getName()+" does not qualify for Top 10");
    }
}


public void replace(Musician tmp){
    int top40min=0;
    for(int i =0;i<top10.size();i++){
        if(top10.get(i).getWeeksInTop40()<top10.get(top40min).getWeeksInTop40()){
            top40min=i;
        }
    }
    if(top10.get(top40min).getWeeksInTop40()<tmp.getWeeksInTop40()){
        System.out.println("The musician "+top10.get(top40min).getName()+" has been replaced by "+tmp.getName()+".");
        top10.set(top40min,tmp);
    }else{
        System.out.println("Sorry, "+tmp.getName()+" has less weeks in the Top 40 than the other musicians.");
    }
}
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}