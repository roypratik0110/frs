package FRS;

public class TouristTicket {
    public String hotelAddress;
    public String[] touristLocation;

    public TouristTicket(String hotelAddress ) {
        this.hotelAddress = hotelAddress;
        this.touristLocation = new String[5];
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

}
