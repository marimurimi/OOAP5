package sample;

public class ContactClass implements Contact {
    private String name;
    private String phoneNumber;

    public ContactClass() {

        this.name = "Ivanov, Ivan";
        this.phoneNumber = "+38(050)123-45-67";

    }

    public String getName() {
        return name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

}