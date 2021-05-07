package com.company.dataAccess.abstracts;

import com.company.entity.concretes.Customer;

public interface CustomerDao {
    public void add(Customer customer);
    public void delete(Customer customer);
    public void update(Customer customer);
    public void getInfo(Customer customer);

}
