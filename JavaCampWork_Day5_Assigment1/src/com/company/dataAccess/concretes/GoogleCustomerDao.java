package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.CustomerDao;
import com.company.entity.concretes.Customer;
// implemente edilip gerekli işlemler yapılacak
public class GoogleCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer eklendi :" + customer.getFirstName() + customer.getLastName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer silindi :" + customer.getFirstName() + customer.getLastName());

    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer güncellendi :" + customer.getFirstName() + customer.getLastName());

    }

    @Override
    public void getInfo(Customer customer) {
        System.out.println("Kullanýcýnýn ismi:"+customer.getFirstName()+System.lineSeparator()
                +"Kullanýcýnýn soyadý: "+customer.getLastName()+System.lineSeparator()+
                "Kullanýcýnýn email adresi: "+customer.getEmail()+System.lineSeparator()+
                "Kullanýcýnýn þifresi: "+customer.getPassword());
    }


}
