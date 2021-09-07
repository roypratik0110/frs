package FRS;

public class Ticket {
    public String pnr;
    public String from;
    public String to;

    public String  departureTime;
    public String  arrivalTime;

    public int seatNo;
    public float price;
    public boolean cancelled;

    public Ticket(String pnr, String from, String to, String  departureTime, String  arrivalTime, int seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String checkStatus(){
       if (cancelled=false) {
           return "Confirmed";
       }
       else {
           return "Cancelled";
       }
    }


    //public int getFlightDuration () {
      //  String format = "24:00";
        //int t1 = Integer.perseInt(departureTime);
        //int t2 = Integer.perseInt(arrivalTime);
        //int t3 = Integer.perseInt(format);
        //int duration;
        //if (t1 < t2) {
          //  duration = t2 - t1;
        //} else {
         //   duration = t3 - (t1 - t2);
        //}
        //return duration;
    //}

    public void cancel(boolean cancelled){
        this.cancelled = cancelled;
    }
}
