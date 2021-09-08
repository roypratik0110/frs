package FRS;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String touristLocation1;
    private String touristLocation2;
    private String touristLocation3;
    private String touristLocation4;
    private String touristLocation5;

    public TouristTicket(String pnr, String from, String to, Passenger passenger, String departureTime, String departureDate, String arrivalTime,
                         String arrivalDate, Flight flight, int seatNo, float price, boolean cancelled, String hotelAddress, String touristLocation1,
                         String touristLocation2,String touristLocation3,String touristLocation4,String touristLocation5){
        super(pnr,from, to, passenger, departureTime, departureDate, arrivalTime, arrivalDate, flight, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation1 = touristLocation1;
        this.touristLocation2 = touristLocation2;
        this.touristLocation3 = touristLocation3;
        this.touristLocation4 = touristLocation4;
        this.touristLocation5 = touristLocation5;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setTouristLocation1(String touristLocation1) {
        this.touristLocation1 = touristLocation1;
    }

    public void setTouristLocation2(String touristLocation2) {
        this.touristLocation2 = touristLocation2;
    }

    public void setTouristLocation3(String touristLocation3) {
        this.touristLocation3 = touristLocation3;
    }

    public void setTouristLocation4(String touristLocation4) {
        this.touristLocation4 = touristLocation4;
    }

    public void setTouristLocation5(String touristLocation5) {
        this.touristLocation5 = touristLocation5;
    }

    public String getTouristLocation1() {
        return touristLocation1;
    }

    public String getTouristLocation2() {
        return touristLocation2;
    }

    public String getTouristLocation3() {
        return touristLocation3;
    }

    public String getTouristLocation4() {
        return touristLocation4;
    }

    public String getTouristLocation5() {
        return touristLocation5;
    }

    public String getTouristLocations() {
        String[] tl = new String[5];
        tl[0] = touristLocation1;
        tl[1] = touristLocation2;
        tl[2] = touristLocation3;
        tl[3] = touristLocation4;
        tl[4] = touristLocation5;
        for (int i=0; i<5; i++){
            System.out.print(tl[i]+",");
        }
        return "";
    }

    public static void printTicketDetails(String pnr) {
        System.out.println(pnr);
    }
}
