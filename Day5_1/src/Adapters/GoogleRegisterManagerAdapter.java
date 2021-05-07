package Adapters;

import Business.abstracts.UserService;
import Entities.concretes.User;
import GoogleRegister.RegisterManager.RegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService {

    @Override
    public void GoogleRegister(User user) {
        RegisterManager register = new RegisterManager();
        register.Register(user);
    }

}
