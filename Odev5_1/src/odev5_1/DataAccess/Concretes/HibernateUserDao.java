package odev5_1.DataAccess.Concretes;

import java.util.List;
import odev5_1.DataAccess.Abstracts.UserDao;
import odev5_1.Entities.Concretes.User;

public class HibernateUserDao implements UserDao{

    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi : " + user.getName());
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
    public User get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
