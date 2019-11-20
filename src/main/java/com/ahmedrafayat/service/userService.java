package com.ahmedrafayat.service;

import com.ahmedrafayat.model.User;


public interface userService {
    public boolean validateStudentCredential(String username, String password);
}
