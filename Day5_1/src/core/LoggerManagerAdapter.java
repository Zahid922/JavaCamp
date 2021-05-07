package core;

import Entities.concretes.User;

public class LoggerManagerAdapter implements LoggerService{

    @Override
    public void logger(User user) {
        System.out.println("Email " + user.getName() 
                + " adlı kullanıcıya gönderildi");
    }
    
    
    
}
