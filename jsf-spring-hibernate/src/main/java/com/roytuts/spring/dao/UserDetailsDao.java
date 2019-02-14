package com.roytuts.spring.dao;

import java.util.List;

import com.roytuts.hibernate.model.UserDetails;

public interface UserDetailsDao {

    public UserDetails getuserDetails(int id);

    public List<UserDetails> getAllUserDetails();

}