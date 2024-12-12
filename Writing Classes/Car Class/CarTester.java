public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car a=new Car(20,15);
        //Fill up the gas tank
        a.addGas();
        //Check the miles available
    System.out.println("Miles available: "+a.milesAvailable());
        //Drive 100 miles
a.drive(100);
        //Check the miles available

    System.out.println("Miles available: "+a.milesAvailable());
        //Add 2 gallons to the gas tank

        a.addGas(2);
        //Check the miles available
    System.out.println("Miles available: "+a.milesAvailable());
        
        //Try driving more miles than available by driving 1000 miles

a.drive(1000);
        //Drive 200 miles

a.drive(200);
        //Check how much gas you have left
System.out.println("Gas remaining: "+a.getGas());
        //Print total miles driven
System.out.println("Total Miles Driven: "+a.getTotalMilesDriven());
    }
}