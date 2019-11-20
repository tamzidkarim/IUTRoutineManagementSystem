package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userDaoImpl implements userDao{


    private static SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserByNamePass(String username, String password) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(User.class);
        sessionFactory = configuration.buildSessionFactory();
        System.out.println("-------------------IN DAO IMPLEMENTA-----------------------");

        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        try
        {
            User user = currentSession.get(User.class,username);
            if(user == null)
            {
                transaction.commit();
                return null;
            }
            else{
                if(user.getPassword().equals(password)){
                    System.out.println("----"+user.getUsername()+"---"+user.getPassword()+"-----");
                    transaction.commit();
                    return user;
                }
                else{
                    return null;
                }
            }
        }
        catch(HibernateException e){
            return null;
        }

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }
}
