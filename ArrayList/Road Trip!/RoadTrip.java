import java.util.ArrayList;

public class RoadTrip
{
    ArrayList<GeoLocation> aaa;
    
    public RoadTrip(){
        aaa=new ArrayList<GeoLocation>();
    }
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude){
        aaa.add(new GeoLocation(name,latitude,longitude));
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops(){
        return aaa.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength(){
        double res=0.0;
        for(int i=0;i<aaa.size()-1;i++){
            res+=aaa.get(i).distanceFrom(aaa.get(i+1));
        }
        return res;
    }
    
    // Return a formatted toString of the trip
    public String toString(){
        String tmp="";
        for(int i=0;i<aaa.size();i++){
            tmp+=((i+1)+". "+aaa.get(i)+"\n");
        }
        return tmp;
    }
}