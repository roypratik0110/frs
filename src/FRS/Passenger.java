package FRS;

public class Passenger {
    public int id;
    public String street;
    public String city;
    public String state;
    public String name;
    public String phoneNumber;
    public String emailId;

    public Passenger(int id, String street, String city, String state, String name, String phoneNumber, String emailId) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getAddressDetails() {
        return street + ", " + city + ", " + state;
    }

    public String getContactDetails() {
        return name + ", " + phoneNumber + ", " + emailId;
    }
}
