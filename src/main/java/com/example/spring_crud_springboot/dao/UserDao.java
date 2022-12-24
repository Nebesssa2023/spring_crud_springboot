package com.example.spring_crud_springboot.dao;



import com.example.spring_crud_springboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(long id);
    void save(User user);
    void update(User user);
    void delete(long id);
}
