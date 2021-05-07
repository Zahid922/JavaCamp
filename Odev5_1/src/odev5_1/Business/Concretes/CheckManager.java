package odev5_1.Business.Concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import odev5_1.Business.Abstracts.CheckService;
import odev5_1.Entities.Concretes.User;

public class CheckManager implements CheckService {

    private String regex = "^ [\\\\ w! # $% & '* + / =? `{|} ~ ^ -] + (?: \\\\. [\\\\ w! # $% &' * + / =?` `{ |} ~ ^ -] +) * @ (?: [a-zA-Z0-9 -] + \\\\.) + [a-zA-Z] {2,6} $";

    public void PasswordCheck(String Password) {
        if (Password.length() < 6) {
            System.out.println("Şifre 6 karakterden uzun olmalıdır lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Şifre onaylandı.");
        }
    }

    public void EmailCheck(String Email , List<User> users) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        System.out.println(Email + " : " + matcher.matches());
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).equals(Email)){
                System.out.println("Bu email daha önce kullanılmış lütfen başka email giriniz.");
            }
        }
    }

    public void NameCheck(String Name, String Surname) {
        if (Name.length() <= 2 && Surname.length() < 2) {
            System.out.println("İsim ve soyisim 2 karakterden kısa olamaz");
        }

    }

    @Override
    public void Register(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Login(User user , String Email , String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Logout(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
