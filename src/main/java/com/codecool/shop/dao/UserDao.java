package com.codecool.shop.dao;
import com.codecool.shop.model.User;

public interface UserDao {
    void add(User user);
    User find(String name, String password);

    User update(Integer userId, String firstName, String lastName, String city, String address, Integer phone);
}
