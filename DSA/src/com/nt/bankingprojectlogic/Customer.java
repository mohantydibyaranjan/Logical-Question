package com.nt.bankingprojectlogic;

import java.util.*;

class Customer {
    private int id;
    private String name;
    private long mobileNumber;
    private String email;
    private String city;
    private String cardNum;
    private String dob;
    private int balance;

    // Constructor
    public Customer(int id, String name, long mobileNumber, String email, String city, String cardNum, String dob, int balance) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;
        this.cardNum = cardNum;
        this.dob = dob;
        this.balance = balance;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
                + ", city=" + city + ", cardNum=" + cardNum + ", dob=" + dob + ", balance=" + balance + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return id == customer.id; // Check equality based on 'id'
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Generate hashCode based on 'id'
    }
}

 