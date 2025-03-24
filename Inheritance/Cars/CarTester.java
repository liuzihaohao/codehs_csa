import java.util.*;

public class CarTester
{
    public static void main(String[] args)
    {
        // Start here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cars' information: ");
        ArrayList<Car> list=new ArrayList<Car>();
        while(true){
            
            
        System.out.println("Model (exit to quit): ");
        String model=scanner.nextLine();
        if(model.equals("exit")){
            break;
        }
        System.out.println("Electric car (y/n): ");
        String tmp=scanner.nextLine();
        if(tmp.equals("y")){
            System.out.println("Percent of battery left (as a whole number): ");
            list.add(new ElectricCar(model,scanner.nextInt()));
        }else{
            System.out.println("Gallons of fuel left: ");
            list.add(new Car(model,scanner.nextInt()));
        }
        scanner.nextLine();
        }
        for(Car i:list){
            System.out.print("\n"+i);
        }
    }
}