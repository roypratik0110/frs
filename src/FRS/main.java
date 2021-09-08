package FRS;

public class main {
    public static void main(String[] args){
        //TouristTicket tt = new TouristTicket("water", "jnfbnd" );
        Passenger pra = new Passenger("kn","jd","jbv","jch","jvjjd","bbd");
        Flight ind = new Flight("hcsh","hvj",25);
        Ticket t1 = new Ticket("hybvc","del","agt",pra,"1:10","1/8/21","3:20", "1/8/21",ind,12,1200,false);

        System.out.println(t1.getFlightDuration());

    }
}