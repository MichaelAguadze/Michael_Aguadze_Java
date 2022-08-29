package com.company;

import java.util.*;
public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getBalance() {
        //update this
        int totalBalance = 0;

        for (AccountRecord charge : charges) {
            totalBalance += charge.getCharge();
        }
        return totalBalance;
    }

    public void setCharges(List<AccountRecord> charges) {
        this.charges = charges;
    }

    public List<AccountRecord> getCharges(){
        return this.charges;
    };

    @Override
    public String toString() {
        //update this
        System.out.println(this.id);
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        return "----";
    }
}
