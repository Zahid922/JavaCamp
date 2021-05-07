package Main;

import Adapters.GoogleRegisterManagerAdapter;
import Business.abstracts.UserService;
import Business.concretes.UserManager;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;
import core.LoggerManagerAdapter;

public class Main {
    
    public static void main(String[] args) {
        
        User user = new User(1, "Zahid@gmail.com", "Zahid1", "Zahid", "Kaçmaz");
        User user2 = new User(2, "Ayşe@gmail.com", "Ayşe1", "Ayşe", "Kaçmaz");
        UserService userService = new UserManager(new HibernateUserDao(),
                 new LoggerManagerAdapter(), new GoogleRegisterManagerAdapter());
        userService.Register(user.getEmail() , user.getPassword());
        userService.Login(user2.getEmail() , user2.getPassword());
        
    }
    
}
