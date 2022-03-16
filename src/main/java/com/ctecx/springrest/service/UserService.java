package com.ctecx.springrest.service;

import com.ctecx.springrest.repository.UserRepository;
import com.ctecx.springrest.usermodel.User;
import org.apache.coyote.http11.upgrade.UpgradeServletInputStream;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private  final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
         return  userRepository.save(user);
    }
}
