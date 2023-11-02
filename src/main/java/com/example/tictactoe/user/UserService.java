package com.example.tictactoe.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> updateUser(Long id, User userDetails){
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            User exisitingUser = user.get();

            exisitingUser.setName(userDetails.getName());
            exisitingUser.setEmail(userDetails.getEmail());

            userRepository.save(exisitingUser);
        }
        return user;
    }

}
