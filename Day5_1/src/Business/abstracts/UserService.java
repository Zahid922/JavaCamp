package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
    
    void Register(String Email , String Password);
    void Login(String Email , String Password);
    void Logout();

    

    
}
