package com.nt.bankingprojectlogic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCustomerMain {
	public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer(1111, "sreenu", 567809322, "sreenu.sreenutech@gmail.com", "hyderabad", "0512223445678432", "24-03-1986", 10000),
            new Customer(1111, "sreenu", 567809322, "sreenu.sreenutech@gmail.com", "hyderabad", "0512223445678432", "24-03-1986", 10000),
            new Customer(1111, "sreenu", 567809322, "sreenu.sreenutech@gmail.com", "hyderabad", "0512223445678432", "24-03-1986", 10000),
            new Customer(1112, "john", 876543210, "john.doe@gmail.com", "mumbai", "0512223445678433", "15-06-1990", 15000)
        );

       
        List<Customer> uniqueCustomers = customers.stream()
            .collect(Collectors.toMap(
                Customer::getId, 
                customer -> customer, 
                (existing, replacement) -> existing 
            ))
            .values()
            .stream()
            .collect(Collectors.toList()); 

        
        uniqueCustomers.forEach(System.out::println);
    }
}
