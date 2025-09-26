package com.dio.santader_dev_week_2025.service.impl;

import com.dio.santader_dev_week_2025.domain.model.User;
import com.dio.santader_dev_week_2025.repository.UserRepository;
import com.dio.santader_dev_week_2025.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {

        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){

            throw  new IllegalArgumentException("This User Id already exist");
        }
        return userRepository.save(userToCreate);
    }
}
