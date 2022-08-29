package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );


    public static void main(String[] args) {

        List<Customer> customerAccounts = new ArrayList<>();
        for (String[] customerData : customerData) {
            Customer customer = (customerAccounts.stream().filter(account -> account.getId() == Integer.parseInt(customerData[0])).findAny().orElse(null));
            if (customer == null) {
                customer = new Customer();
                customer.setId(Integer.parseInt(customerData[0]));
                customer.setName(customerData[1]);
                customerAccounts.add(customer);
            }

            AccountRecord accountRecord = new AccountRecord();
            accountRecord.setCharge((Integer.parseInt((customerData[2]))));
            accountRecord.setChargeDate(customerData[3]);
            customer.getCharges().add(accountRecord);
        }
//        print positive customer accounts
        System.out.println("Negative Accounts");
        List<Customer> positiveAccounts = customerAccounts.stream().filter(customer -> customer.getBalance() >= 0).collect(Collectors.toList());
        positiveAccounts.stream().forEach(name -> System.out.println(name.toString()));

//      show negative customer accounts
        System.out.println("Negative Accounts");
        List<Customer> negativeAccounts = customerAccounts.stream().filter(customer -> customer.getBalance() < 0).collect(Collectors.toList());
        negativeAccounts.stream().forEach(name -> System.out.println(name.toString()));
    }

}
