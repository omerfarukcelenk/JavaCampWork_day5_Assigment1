package com.company.business.abstracts;

import com.company.entity.concretes.Customer;

public interface CustomerService {
    public boolean CheckEmailCorrection(Customer customer);
    public boolean CheckEmailCorrection2(Customer customer);
    public boolean CheckPassword(Customer customer);
    public boolean CheckFirstName(Customer customer);
    public boolean CheckLastName(Customer customer);
    public void login(Customer customer);
    public boolean register(Customer customer);
    public boolean sendVerificationMessage(Customer customer);
    public boolean RegisterWithGoogleMailAccount(Customer customer);



}
