package FRS;

public class RegularTicket extends Ticket {
    private String specialService;

    public RegularTicket(String pnr, String from, String to, Passenger passenger, String departureTime, String departureDate, String arrivalTime,
                         String arrivalDate, Flight flight, int seatNo, float price, boolean cancelled, String specialService) {
        super(pnr, from, to, passenger, departureTime, departureDate, arrivalTime, arrivalDate, flight, seatNo, price, cancelled);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        if (specialService.equals("food") || specialService.equals("water") || specialService.equals("snacks")) {
            return "Special Service availed";
        } else {
            return "Select valid Special Service";
        }
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public static void printTicketDetails(String pnr) {
        System.out.println(pnr);
    }
}