package odev5_1.Business.Concretes;

import odev5_1.Adapters.Abstracts.GoogleRegisterService;
import odev5_1.Business.Abstracts.UserService;
import odev5_1.Core.Abstracts.LoggerService;
import odev5_1.DataAccess.Abstracts.UserDao;
import odev5_1.Entities.Concretes.User;

public class UserManager implements UserService {

    private UserService userService;
    private LoggerService loggerService;
    private GoogleRegisterService googleRegisterService;

    public UserManager(UserDao userDao, LoggerService loggerService, GoogleRegisterService googleRegisterService) {
        super();
        this.userService = userService;
        this.loggerService = loggerService;
        this.googleRegisterService = googleRegisterService;
    }

    @Override
    public void Register(User user) {
        System.out.println(user.getName() +" " +  user.getSurname() + " kullanıcı kayıt oldu");
    }

    @Override
    public void Login(User user, String Email, String Password) {
        if (user.getEmail().equals(Email)) {
            System.out.println("Email doğru girdiniz");
        } else {
            System.out.println("Email yanlış girdiniz");
        }
        if (user.getPassword().equals(Password)) {
            System.out.println("Şifreyi doğru girdiniz");
        } else {
            System.out.println("Şifreyi yankış girdiniz");
        }

    }

    @Override
    public void Logout(User user) {
        System.out.println("Sistemden çıkış yapıldı");
    }

}
