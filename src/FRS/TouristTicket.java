package FRS;

import java.rmi.NotBoundException;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocation = new String[4];

    public TouristTicket(String pnr, String from, String to, Passenger passenger, String departureTime, String departureDate, String arrivalTime,
                         String arrivalDate, Flight flight, int seatNo, float price, boolean cancelled, String hotelAddress, String[] touristLocation){
        super(pnr,from, to, passenger, departureTime, departureDate, arrivalTime, arrivalDate, flight, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation[4] = touristLocation[4];
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }
}
