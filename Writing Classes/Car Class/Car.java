public class Car {
    private double efficiency; // this is miles per gallon
private double gas;
private double tankCapacity;
private double totalMilesDriven;
    // Start here
    
    
    public Car(double carEfficiency, double carTankCapacity){
        efficiency=carEfficiency;
        tankCapacity=carTankCapacity;
        gas=0;totalMilesDriven=0;
    }
    
    public void addGas(){
        System.out.println("Filling up ...");
        gas=tankCapacity;
    }
    
    public void addGas(double amount){
        
        System.out.println("Adding gas ...");
        
        if(amount+gas>tankCapacity){
            gas=tankCapacity;
        }else{
            gas=amount+gas;
        }
    }
    public double getTotalMilesDriven(){
        return totalMilesDriven;
    }
    public void drive(double distance){
        if(gas*efficiency<distance){
            System.out.println("Can't drive "+distance+". That's too far!");
            return;
        }
        totalMilesDriven+=distance;
        gas-=(distance/efficiency);
        System.out.println("Driving "+distance);
    }
    public boolean canDrive (double distance){
        
        if(gas*efficiency<distance){
            return false;
        }
        return true;
    }
    public double milesAvailable(){
        return gas*efficiency;
    }
    public double getGas(){
        return gas;
    }
}