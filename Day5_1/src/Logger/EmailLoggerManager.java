package Logger;

import Entities.concretes.User;

public class EmailLoggerManager {
    
    public void logger(User user){
        System.out.println("Email " + user.getName() 
                + " adlı kullanıcıya gönderildi");
    }
    
}
