package com.den.spring_boot.Service;

import com.den.spring_boot.model.User;


import java.util.List;

public interface UserService {
    List<User> index();

    User show(Long id);

    void save(User user);

    void update(User updateUser);

    void deleteById(Long id);
}
