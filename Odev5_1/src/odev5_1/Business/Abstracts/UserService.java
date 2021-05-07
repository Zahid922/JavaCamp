package odev5_1.Business.Abstracts;

import odev5_1.Entities.Concretes.User;

public interface UserService {
    
    void Register(User user);
    void Login(User user , String Email , String Password);
    void Logout(User user);
    
    
}
