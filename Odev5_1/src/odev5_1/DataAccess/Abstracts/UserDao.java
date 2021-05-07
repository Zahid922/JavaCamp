package odev5_1.DataAccess.Abstracts;

import java.util.List;
import odev5_1.Entities.Concretes.User;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(User user);

    User get(int id);

    List<User> getAll();

}
