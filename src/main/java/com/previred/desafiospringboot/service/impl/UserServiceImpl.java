package com.previred.desafiospringboot.service.impl;

import com.previred.desafiospringboot.model.CustomUser;
import com.previred.desafiospringboot.repository.UserRepository;
import com.previred.desafiospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<CustomUser> getAllUsers() {
        return userRepository.findAll();
    }
}
