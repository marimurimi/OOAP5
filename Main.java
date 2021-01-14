package sample;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> countries = new HashMap<>();

    public static void main(String[] args) {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

        Contact contact = new ContactClass();
        Customer customer = new CustomerClass();
        IncomeData incomeData = new IncomeDataClass();

        Contact contactIncomeData = new IncomeDataAdapter(incomeData);
        Customer customerIncomeData = new IncomeDataAdapter((incomeData));


        System.out.println("Contact");
        contactTest(contact);
        System.out.println();

        System.out.println("Customer");
        customerTest(customer);
        System.out.println();

        System.out.println("IncomeData");
        incomeDataTest(incomeData);
        System.out.println();


        System.out.println("IncomeDataAdapter");
        contactTest(contactIncomeData);
        customerTest(customerIncomeData);
        System.out.println();

    }

    public static void contactTest(Contact contact) {
        System.out.println("Name: " + contact.getName());
        System.out.println("Phone number: " + contact.getPhoneNumber());
    }

    public static void customerTest(Customer customer) {
        System.out.println("Company name: " + customer.getCompanyName());
        System.out.println("Country Name: " + customer.getCountryName());

    }

    public static void incomeDataTest(IncomeData incomeData){
        System.out.println("Country code: "+incomeData.getCountryCode());
        System.out.println("Company: "+incomeData.getCompany());
        System.out.println("Contact First name: "+incomeData.getContactFirstName());
        System.out.println("Contact last name: "+incomeData.getContactLastName());
        System.out.println("Country phone code: "+incomeData.getCountryPhoneCode());
        System.out.println("Phone number: "+incomeData.getPhoneNumber());
    }
}
