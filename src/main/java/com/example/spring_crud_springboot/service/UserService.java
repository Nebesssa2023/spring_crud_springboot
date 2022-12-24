package com.example.spring_crud_springboot.service;



import com.example.spring_crud_springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(long id);
    void save(User user);
    void update(long id, User user);
    void delete(long id);
}
