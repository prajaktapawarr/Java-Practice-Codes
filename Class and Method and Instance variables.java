//The code given below has a Customer class and a Tester class.
// The instance variables and methods are also provided.
// An object of the class is created inside the main method (inside Tester class).
package com.company;
import java.util.Scanner;
class Customer {

    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***************************");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
        System.out.println();
    }

}

class Tester {

    public static void main(String[] args) {

        // Object creation
        Customer customer = new Customer();

        // Assigning values to the instance variables
        customer.customerId = "C101";
        customer.customerName = "Stephen Abram";
        customer.contactNumber = 7856341287L;
        customer.address = "D089, St. Louis Street, Springfield, 62729";

        // Displaying the customer details
        customer.displayCustomerDetails();
        // Move the above statement immediately after the object creation
        // statement and observe the output

    }

}