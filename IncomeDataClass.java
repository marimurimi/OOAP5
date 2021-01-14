package sample;

public class IncomeDataClass implements IncomeData {

    private String countryCode;
    private String company;
    private String contactFirstName;
    private String contactLastName;
    private int phoneCode;
    private int phoneNumber;

    public IncomeDataClass() {

        this.countryCode = "UA";
        this.company = "JavaRush Ltd.";
        this.contactFirstName = "Ivan";
        this.contactLastName = "Ivanov";
        this.phoneCode = 38;
        this.phoneNumber = 501234567;
    }


    public String getCountryCode() {
        return countryCode;
    }


    public String getCompany() {
        return company;
    }


    public String getContactFirstName() {
        return contactFirstName;
    }


    public String getContactLastName() {
        return contactLastName;
    }


    public int getCountryPhoneCode() {
        return phoneCode;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }
}

