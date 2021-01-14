package sample;

public class IncomeDataAdapter implements Customer, Contact {
    IncomeData incomeData;

    public IncomeDataAdapter(IncomeData incomeData) {
        this.incomeData = incomeData;
    }


    public String getName() {
        return incomeData.getContactLastName() + ", " + incomeData.getContactFirstName();
    }


    public String getPhoneNumber() {
        String phone = String.valueOf(incomeData.getPhoneNumber());
        while (phone.length()!=10)
            phone = "0"+phone;


        return "+" + incomeData.getCountryPhoneCode()+"("+phone.substring(0, 3)+")"+
                phone.substring(3, 6)+"-"+phone.substring(6,8)+"-"+phone.substring(8);
    }


    public String getCompanyName() {

        return incomeData.getCompany();
    }


    public String getCountryName() {

        return Main.countries.get(incomeData.getCountryCode());
    }
}