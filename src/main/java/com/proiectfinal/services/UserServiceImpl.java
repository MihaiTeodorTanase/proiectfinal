package com.proiectfinal.services;

import com.proiectfinal.entities.UserModel;
import com.proiectfinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserModel add(UserModel userModel) {
        return userRepository.saveAndFlush(userModel);
    }
}
