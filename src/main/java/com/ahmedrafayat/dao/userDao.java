package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.User;

import java.util.List;

public interface userDao {
    public void addUser(User user);
    public void updateUser(User user);
    public List<User> getUserList();
    public User getUserByNamePass(String username, String password);
    public void removeUser(User user);
    public User getUser(int id);
    public User getUser(String username);
}
