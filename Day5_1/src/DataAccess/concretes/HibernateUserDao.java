package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;
import java.util.List;

public class HibernateUserDao implements UserDao{

    @Override
    public void add(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User get(int Id) {
        return null;
    }
    
    
    
}
