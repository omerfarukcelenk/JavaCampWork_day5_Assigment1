package com.company.business.concretes;

import com.company.business.abstracts.CustomerService;
import com.company.entity.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.GoogleRegax.GoogleAdapthManager;

public class CustomerManager implements CustomerService {
    @Override
    public boolean CheckEmailCorrection(Customer customer) {
        String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher= emailPat.matcher(customer.getEmail());
        System.out.println("Email doğrulanması sona erdi.");
        return matcher.find();
    }

    @Override
    public boolean CheckEmailCorrection2(Customer customer) {
        if (customer.getEmail().isEmpty()){
            System.out.println("Email bulunamadı");
            return false;
        }
        System.out.println("Email sistemde bulundu." + customer.getEmail());
        return true;
    }

    @Override
    public boolean CheckPassword(Customer customer) {
        if (customer.getPassword().length()<6 || customer.getPassword().isEmpty()){
            System.out.println("Şifreniz 6 karakterden oluşmalıdır");
            return  false;
        }else  {
            System.out.println("Şifre kaydedildi.");
            return true;
        }
    }

    @Override
    public boolean CheckFirstName(Customer customer) {
        if (customer.getFirstName().length()<2 || customer.getFirstName().isEmpty()){
            System.out.println("İsminiz 2 karakterden küçük olmaz.");
            return false;
        }else {
            System.out.println("İsminiz kaydedildi");
            return true;
        }
    }

    @Override
    public boolean CheckLastName(Customer customer) {
        if (customer.getLastName().length()<2 || customer.getLastName().isEmpty()){
            System.out.println("soyisminiz 2 karakterden küçük olmaz.");
            return false;
        }else {
            System.out.println("İsminiz kaydedildi");
            return true;
        }
    }

    @Override
    public void login(Customer customer) {
        System.out.println("Giriş işlemi daha önceden doğrulanmış olan email ve şifre üzerinden otomatik olarak gerçekleştirilmektedir.");
        System.out.println("email: "+customer.getEmail());
        System.out.println("şifre: "+customer.getPassword());
    }

    @Override
    public boolean register(Customer customer) {
        if(	CheckEmailCorrection(customer) &&
                CheckEmailCorrection2(customer) &&
                CheckFirstName(customer) &&
                CheckLastName(customer) &&
                CheckPassword(customer)) {
            System.out.println("Kayıt işlemi başarılı...");
            return true;

        }else
        {
            System.out.println("Kayıt işlemi başarısız.");
            return false;
        }
    }

    @Override
    public boolean sendVerificationMessage(Customer customer) {
        if (CheckEmailCorrection(customer)&& CheckEmailCorrection2(customer)) {
            System.out.println("Email adresiniz doğrulandı: " + customer.getEmail());
            return true;
        }else {
            System.out.println("Email adresiniz doğrulama aşamasını geçemedi, lütfen dikkat ediniz");
            return false;
        }
    }

    @Override
    public boolean RegisterWithGoogleMailAccount(Customer customer) {
        GoogleAdapthManager googleadapt= new GoogleAdapthManager();
        if(googleadapt.connectGoogle(customer)) {
            return true;
        }else {
            return false;
        }
    }
}
