package com.roytuts.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.roytuts.hibernate.model.UserDetails;
import com.roytuts.spring.dao.UserDetailsDao;
import com.roytuts.spring.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;


    public UserDetails getuserDetails(int id) {
        return userDetailsDao.getuserDetails(id);
    }


    public List<UserDetails> getAllUserDetails() {
        return userDetailsDao.getAllUserDetails();
    }

    public UserDetailsDao getUserDetailsDao() {
        return userDetailsDao;
    }

}