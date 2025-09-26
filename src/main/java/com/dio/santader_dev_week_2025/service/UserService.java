package com.dio.santader_dev_week_2025.service;

import com.dio.santader_dev_week_2025.domain.model.User;

public interface UserService {


     public default User findById(Long id){
         return null;
     }


     public default User create(User userToCreate) {
        return null;
    }
}
