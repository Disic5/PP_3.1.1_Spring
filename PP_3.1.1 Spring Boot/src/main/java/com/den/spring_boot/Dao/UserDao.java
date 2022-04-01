package com.den.spring_boot.Dao;

import com.den.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();

    User show(Long id);

    void save(User user);

    void update(User updateUser);

    void deleteById(Long id);
}
