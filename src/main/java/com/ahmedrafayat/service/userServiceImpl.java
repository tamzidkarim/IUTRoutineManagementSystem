package com.ahmedrafayat.service;

import com.ahmedrafayat.dao.userDao;
import com.ahmedrafayat.dao.userDaoImpl;
import com.ahmedrafayat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class userServiceImpl implements userService{

    @Autowired
    private com.ahmedrafayat.dao.userDao dao;

    public void setStudentDAO(userDao someDao) {
        this.dao = someDao;
    }

    /*
    public userDao getUserDAO() {
        return dao;
    }
    */


    @Override
    public boolean validateStudentCredential(String username, String password) {
        System.out.println("---------------------in userservice impl------------------------------");
        userDao dao = new userDaoImpl();
        User user = dao.getUserByNamePass(username, password);
        if(user==null){
            return false;
        }
        else{
            return true;
        }
    }
}
