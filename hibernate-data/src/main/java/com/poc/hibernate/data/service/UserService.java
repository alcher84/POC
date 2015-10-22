package com.poc.hibernate.data.service;

import com.poc.hibernate.data.model.Users;
import com.poc.hibernate.data.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by achernysh on 22.10.2015.
 */
@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return this.usersRepository.getAllUsers();
    }


}
