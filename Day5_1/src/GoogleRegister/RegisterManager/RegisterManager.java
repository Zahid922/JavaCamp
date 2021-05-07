package GoogleRegister.RegisterManager;

import Entities.concretes.User;

public class RegisterManager {
    
    public void Register(User user){
        System.out.println("Google ile giriş yapıldı " + user.getEmail());
    }
    
}
