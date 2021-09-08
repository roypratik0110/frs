package FRS;

import java.rmi.NotBoundException;

public class TouristTicket {
    private String hotelAddress;
    private String[] touristLocation = new String[5];

    public TouristTicket(String hotelAddress, String[] touristLocation) {
        this.hotelAddress = hotelAddress;
        this.touristLocation[5] = touristLocation[5];
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
