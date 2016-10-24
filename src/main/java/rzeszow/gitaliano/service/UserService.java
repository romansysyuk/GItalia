package rzeszow.gitaliano.service;

import rzeszow.gitaliano.entity.City;
import rzeszow.gitaliano.entity.User;

import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface UserService {
    User addUser(User user);
    void delete(long id);
    User findById(long id);
    User updateUser(User user);
    List<User> findByName(String Name);
    List<User> findByCity(City city);
    List<User> getAll();


}
