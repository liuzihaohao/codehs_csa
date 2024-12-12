public class Distance
{
    private double kilometers;
    public Distance(double tmp){
        kilometers=tmp;
    }
    public double toMiles(){
        return kilometers/1.609;
    }
    public double toLeagues(){
        return kilometers/5.556;
    }
    public double doubleMiles(){
        return toMiles()*2;
    }
    public double getKilometers(){
        return kilometers;
    }
}