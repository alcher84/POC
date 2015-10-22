package com.poc.hibernate.data.repositories;

import com.poc.hibernate.data.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by achernysh on 22.10.2015.
 */
@Transactional
@Repository
public class UsersRepository {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Users> getAllUsers() {
        return this.hibernateTemplate.loadAll(Users.class);
    }

    public Integer createUser(Users user) {
        Users mergeUser = this.hibernateTemplate.merge(user);
        return mergeUser.getUserId();
    }
}
