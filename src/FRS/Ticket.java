package FRS;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Passenger passenger;
    private String departureTime;
    private String departureDate;
    private String arrivalTime;
    private String arrivalDate;
    private Flight flight;
    private int seatNo;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, Passenger passenger, String  departureTime, String departureDate, String  arrivalTime, String arrivalDate, Flight flight, int seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.passenger = passenger;
        this.departureTime = departureTime;
        this.departureDate = departureDate;
        this.arrivalTime = arrivalTime;
        this.arrivalDate = arrivalDate;
        this.flight = flight;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }


    public String checkStatus(){
       if (cancelled==false) {
           return "Confirmed";
       }
       else {
           return "Cancelled";
       }
    }

    public String getFlightDuration () {
        String[] dt = departureTime.split(":");
        String dt1 = dt[0];
        String dt2 = dt[1];

        String[] at = arrivalTime.split(":");
        String at1 = at[0];
        String at2 = at[1];
        int dTime1 = Integer.parseInt(dt1);
        int dTime2 = Integer.parseInt(dt2);
        int aTime1 = Integer.parseInt(at1);
        int aTime2 = Integer.parseInt(at2);
        int d1=0;
        int d2=0;
        if(dTime1 < aTime1) {
            d1 = aTime1 - dTime1;
            if (dTime2 < aTime2) {
                d2 = aTime2 - dTime2;
            } else {
                d2 = 60 - (dTime2 - aTime2);
            }
        }
        else if (dTime1 > aTime1){
            d1 =24 - (dTime1 - aTime1);
            if (dTime2 < aTime2) {
                d2 = aTime2 - dTime2;
            } else {
                d2 = 60 - (dTime2 - aTime2);
            }
        }
        return d1+" hours "+ d2+" minutes.";
    }

    public void cancel(boolean cancelled){
        this.cancelled = cancelled;
    }

    public String getPnr() {
        return pnr;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public static void printTicketDetails(String pnr) {
    }
}