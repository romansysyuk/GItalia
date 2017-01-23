package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rzeszow.gitaliano.dao.UserRepository;
import rzeszow.gitaliano.entity.City;
import rzeszow.gitaliano.entity.User;
import rzeszow.gitaliano.service.UserService;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.*;

/**
 * Created by kobeb on 14.01.2017.
 */
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        User saveUser = userRepository.saveAndFlush(user);
                return saveUser;

    }

    public void delete(long id) {
        userRepository.delete(id);
    }

    public User findById(long id) {
        return userRepository.findOne(id);
    }

    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public List<User> findByName(String name) {
        return userRepository.findByName(name) ;
    }

    public List<User> findByCity(City city) {
        return userRepository.findByCity(city);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
