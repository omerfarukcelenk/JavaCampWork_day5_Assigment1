package com.company;

import com.company.business.concretes.CustomerManager;
import com.company.entity.concretes.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Ömer Faruk");
        customer1.setLastName("Çelenk");
        customer1.setEmail("omerfar0133@gmail.com");
        customer1.setPassword("123456789123456789");

        Customer customer2 = new Customer();
        customer2.setId(1);
        customer2.setFirstName("Selahattin");
        customer2.setLastName("Çelenk");
        customer2.setEmail("selobaba3321@gmail.com");
        customer2.setPassword("123456789");

        System.out.println("******************* \t");


        CustomerManager customerManager = new CustomerManager();
        customerManager.CheckEmailCorrection(customer1);
        customerManager.CheckEmailCorrection2(customer1);
        customerManager.CheckFirstName(customer1);
        customerManager.CheckLastName(customer1);
        customerManager.CheckPassword(customer1);
        customerManager.register(customer1);
        customerManager.login(customer1);
        customerManager.sendVerificationMessage(customer1);
        customerManager.RegisterWithGoogleMailAccount(customer1);

        System.out.println("******************* \t");

        customerManager.CheckEmailCorrection(customer2);
        customerManager.CheckEmailCorrection2(customer2);
        customerManager.CheckFirstName(customer2);
        customerManager.CheckLastName(customer2);
        customerManager.CheckPassword(customer2);
        customerManager.register(customer2);
        customerManager.login(customer2);
        customerManager.sendVerificationMessage(customer2);
        customerManager.RegisterWithGoogleMailAccount(customer2);


    }
}
