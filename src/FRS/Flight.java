package FRS;

public class Flight {
    private String flightNumber;
    private String  airline;
    private int capacity;
    private static int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

    static{
        bookedSeats=0;
    }

    public String getFlightDetails(){
        return flightNumber+" of "+airline+" with capacity: "+capacity+" and booked seats: "+bookedSeats;
    }

    public boolean checkAvailability(){
        if(bookedSeats<capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public static int bookedSeatCounter(){
        return bookedSeats++;
    }
}
