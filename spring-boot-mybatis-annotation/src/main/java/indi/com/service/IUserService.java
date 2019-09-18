package indi.com.service;

import indi.com.bean.User;

import java.util.List;

public interface IUserService {

    User getUserById(String id);

    List<User> getUserByName(String name);

    List<User> getUsers();
}
