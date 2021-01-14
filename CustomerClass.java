package sample;

public class CustomerClass implements Customer {
    private String companyName;
    private String countryName;

    public CustomerClass() {
        this.companyName = "JavaRush Ltd.";
        this.countryName = "Ukraine";
    }


    public String getCompanyName() {

        return companyName;
    }


    public String getCountryName() {

        return countryName;
    }
}