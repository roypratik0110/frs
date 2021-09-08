package FRS;

public class main {
    public static void main(String[] args){
        Passenger prat = new Passenger("Central Road","Delhi","Delhi","Pratik","1234567890","abc@def.com");
        Flight ind = new Flight("IND101","Air India",150);
        RegularTicket rt = new RegularTicket("AIIND6502","del","agt",prat,"1:10","1/8/21","3:20",
                "1/8/21",ind,12,5000,false,"Water");
        TouristTicket tt = new TouristTicket("12345","del","agt",prat,"1:10","1/8/21","3:20",
                "1/8/21",ind,12,5000,false,"abc","def","ghi","jkl","mno","pqr");

        System.out.println(rt.getFlightDuration());
        System.out.println(tt.getTouristLocations());
        RegularTicket.printTicketDetails(rt.getPnr());
        TouristTicket.printTicketDetails(tt.getPnr());

    }

}