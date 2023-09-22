package com.venikov.springboot.crud_springboot.service;

import com.venikov.springboot.crud_springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUser(long id);

    void save(User user);

    void update(long id, User updateUser);

    void delete(long id);
}
