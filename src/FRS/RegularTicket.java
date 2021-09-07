package FRS;

public class RegularTicket {
    public String specialService;

    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }

    public String getSpecialService() {
        if (specialService.equals("food") || specialService.equals("water") || specialService.equals("snacks")) {
            return "Special Service availed";
        } else {
            return "Select valid Special Service";
        }
    }
}