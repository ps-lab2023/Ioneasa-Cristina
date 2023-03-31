package com.example.demo.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.entity.User_type;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementare implements UserService{

    @Autowired
    private UserRepository userRepository;
        public UserServiceImplementare(UserRepository userRepository){
            this.userRepository = userRepository;
        }
    @Override
    public User findByUserame(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findByType(User_type user_type) {
        return userRepository.findByType(user_type);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @SneakyThrows
    @Override
    public User updateUser(User user, String password){
        user.setPassword(password);
        userRepository.save(user);
        return user;
    }

}
