import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tmp){
        tickets=tmp;
    }
    
    public ArrayList<AirlineTicket> getTickets(){
        return tickets;
    }
    
    public void printPassengersByBoardingGroup(){
        for(int i=1;i<=5;i++){
            System.out.println("Boarding Group "+i+":");
            for(AirlineTicket tmp:tickets){
                if(tmp.getBoardingGroup()==i){
                    System.out.println(tmp.getName());
                }
            }
        }
    }
    
    public void canBoardTogether(){
        boolean flag=true;
        for(int i=0;i<tickets.size()-1;i++){
            if((tickets.get(i).getBoardingGroup()==tickets.get(i+1).getBoardingGroup())&&(tickets.get(i).getRow()==tickets.get(i+1).getRow())){
                System.out.println(tickets.get(i).getName()+" can board with "+tickets.get(i+1).getName());flag=false;
            }
        }
        if(flag){
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}