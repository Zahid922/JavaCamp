package Business.concretes;

import Adapters.GoogleRegisterService;
import Business.abstracts.UserService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;
import core.LoggerService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    UserDao userDao;
    LoggerService loggerService;
    GoogleRegisterService googleRegisterService;

    public UserManager(UserDao userDao, LoggerService loggerService, GoogleRegisterService googleRegisterService) {
        super();
        this.userDao = userDao;
        this.loggerService = loggerService;
        this.googleRegisterService = googleRegisterService;
    }

    public void EmailVerification(String Email) {
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        if (matcher.matches() == true) {
            System.out.println("Email kaydedildi");

        } else {
            System.out.println("Email hatalı lütfen tekrar giriniz");

        }

    }

    public void PasswordCheck(String Password) {
        if (Password.length() < 6) {
            System.out.println("Şifre en az 6 karakterden oluşmalıdır.");

        } else {
            System.out.println("Şifre kaydedildi");
        }
    }

    @Override
    public void Register(String Email, String Password) {
        EmailVerification(Email);
        PasswordCheck(Password);
        System.out.println("Sisteme başarıyla kayıt oldunuz.");
    }

    @Override
    public void Login(String Email, String Password) {
        System.out.println("Email giriniz : ");
        System.out.println("Şifreyi giriniz : ");
        System.out.println("Sisteme başarıyla giriş yapıldı");
        
    }
    

    @Override
    public void Logout() {
        System.out.println("Sistemden çıkıldı. ");
    }




}
