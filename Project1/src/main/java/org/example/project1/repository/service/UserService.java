package org.example.project1.repository.service;

import org.example.project1.model.User;
import org.example.project1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        public User registerUser(User user) {
            user.setPassword(passwordEncoder.encode(user.getPassword())); // Encrypt password
            return userRepository.save(user);
        }

        public User findUserByEmail(String email) {
            return userRepository.findByEmail(email);
        }
    }

