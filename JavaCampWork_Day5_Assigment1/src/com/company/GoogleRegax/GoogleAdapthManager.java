package com.company.GoogleRegax;

import com.company.entity.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleAdapthManager implements GoogleAdapthService{
    @Override
    public boolean connectGoogle(Customer customer) {
        String emailRegex="^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(customer.getEmail());
        System.out.println("Google email hesabınız kontrol ediliyor. "
        + "Eğer doğrulama sonucu doğru ise işleminiz sorunsuz olarak tamamlanacaktır, "
        + "Değil ise işleminiz tamamlanamaz : " +matcher.find());
        return matcher.find();
    }
}
