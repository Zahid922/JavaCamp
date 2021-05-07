
package odev5_1;

import java.util.ArrayList;
import java.util.List;
import odev5_1.Adapters.Concretes.GoogleRegisterManagerAdapter;
import odev5_1.Business.Abstracts.UserService;
import odev5_1.Business.Concretes.UserManager;
import odev5_1.Core.Concretes.LoggerManager;
import odev5_1.DataAccess.Concretes.HibernateUserDao;
import odev5_1.Entities.Concretes.User;

public class Main {

    public static void main(String[] args) {
        
        UserService userService = new UserManager(new HibernateUserDao(), new LoggerManager() , new GoogleRegisterManagerAdapter());
        List<User> users = new ArrayList<User>();
        User user = new User("Zahid" , "Kaçmaz" , "zahid@gmail.com" , "123456");
        users.add(user);
        System.out.println(users.get(0).getName());
        User user1 = new User("Ayşe" , "Kaçmaz" , "ayşe@gmail.com" , "654321");
        users.add(user1);
        userService.Register(user);
        userService.Login(user, user.getEmail() , user.getPassword());  
        
    }
    
}
