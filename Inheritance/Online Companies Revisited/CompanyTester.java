import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input=new Scanner(System.in);
        ArrayList<Company> list=new ArrayList<Company>();
        
        while(true){
            System.out.println("Please enter a company name, enter 'exit' to quit: ");
            String name=input.nextLine();
            if(name.equals("exit")){
                break;
            }
            
            System.out.println("Is this an online company, 'yes' or 'no': ");
            String b=input.nextLine();
            if(b.equals("yes")){
                System.out.println("Please enter the website address: ");
                String webAddress=input.nextLine();
                OnlineCompany tmp=new OnlineCompany(name,webAddress);
                list.add(tmp);
            }else{
                System.out.println("Please enter the street address: ");
                String address=input.nextLine();
                
                System.out.println("Please enter the city: ");
                String city=input.nextLine();
                
                System.out.println("Please enter the state: CA");
                String state=input.nextLine();
                
                list.add(new Company(name,address,city,state));
            }
        }
        for(Company i:list){
            System.out.println(i+"\n");
        }
    }
}