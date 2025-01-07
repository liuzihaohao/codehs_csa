import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> tmp){
        for(Double aaa:tmp){
            System.out.println(aaa);
        }
    }
    public static void condense(ArrayList<Double> tmp){
        boolean flag=false;
        for(int i=0;i<tmp.size();i++){
            if(flag){
                tmp.set(i-1,tmp.get(i)*tmp.get(i-1));
                tmp.remove(i);
                i--;
            }
            flag=!flag;
        }
    }
    public static void duplicate(ArrayList<Double> tmp){
        int len=tmp.size();
        for(int i=0;i<len;i++){
            tmp.add(tmp.get(i));
        }
    }
}