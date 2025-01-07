import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> tmp){
        for(int i=0;i<tmp.size();i++){
            for(int j=i+1;j<tmp.size();j++){
                if(tmp.get(i).equals(tmp.get(j))){
                    // tmp.remove(j);j--;
                    System.out.println(tmp.get(i));
                    tmp.remove(j);j--;
                }
            }
        }
    }
    
    
    public static void removeName(ArrayList<String> tmp, String tmp2){
        for(int i=0;i<tmp.size();i++){
            if(tmp.get(i).indexOf(tmp2)>=0){
                System.out.println(tmp.get(i));
                tmp.remove(i);i--;
            }
        }
    }
    
    public static boolean correctlyFormatted(ArrayList<String> tmp){
        for(String i:tmp){
            String[] tmmp=i.split(" ");
            System.out.println(tmmp[0]);
            if(tmmp.length!=2){
                return false;
            }
            if(!Character.isUpperCase(tmmp[0].charAt(0))){
                return false;
            }
            if(!Character.isUpperCase(tmmp[1].charAt(0))){
                return false;
            }
        }
        return true;
    }
}