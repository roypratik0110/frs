package FRS;

public class main {
    public static void main(String[] args){
        Passenger pra = new Passenger("kn","jd","jbv","jch","jvjjd","bbd");
        Flight ind = new Flight("hcsh","hvj",25);
        RegularTicket rt = new RegularTicket("hybvc","del","agt",pra,"1:10","1/8/21","3:20",
                "1/8/21",ind,12,1200,false,"Water");
        //TouristTicket tt = new TouristTicket("12345","del","agt",pra,"1:10","1/8/21","3:20",
            //    "1/8/21",ind,12,1200,false,"bcjd",new String[]{"jbcs","jbncs","jnc","x ","jsj"});

        System.out.println(rt.getFlightDuration());
        //System.out.println(tt.getTouristLocation());

    }

}