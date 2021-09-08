package FRS;

public class Passenger {
    private static int idCounter;
    private int id;

    private static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact{
        private String name;
        private String phoneNumber;
        private String emailId;

        public Contact(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }
    }
    private Contact contact;

    static {
        idCounter = 0;
    }

    public Passenger(String addressStreet, String addressCity, String addressState, String contactName, String contactPhoneNumber, String contactEmailId) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhoneNumber, contactEmailId);
    }

    public int getId() {
        return id;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phoneNumber + ", " + contact.emailId;
    }

    public int getPassengerCount(){
        return idCounter;
    }
}