package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Faculty;
import com.ahmedrafayat.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;

import java.util.ArrayList;
import java.util.List;

public class facultyDaoImpl implements facultyDao{

    private static SessionFactory sessionFactory;

    @Override
    public List<Faculty> getFacultyList() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        System.out.println("-------------------IN DAO IMPLEMENTA-----------------------");

        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        List<Faculty> facultyList = currentSession.createSQLQuery("SELECT * FROM faculty").addEntity(Faculty.class).list();
        for(Faculty faculty : facultyList){
            System.out.println(faculty.toString());
        }
        return facultyList;
    }

    @Override
    public List<Faculty> getFacultywithParams(String department) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        System.out.println("-------------------IN DAO IMPLEMENTA-----------------------");

        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        List<Faculty> facultyList = currentSession.createSQLQuery("SELECT * FROM faculty where department_name='"+department+"'").addEntity(Faculty.class).list();
        for(Faculty faculty : facultyList){
            System.out.println(faculty.toString());
        }
        return facultyList;
    }

    @Override
    public int addFaculty(Faculty faculty) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        int status=1; //1 is default value

        Session currentSession = sessionFactory.openSession();

        Transaction transaction = currentSession.beginTransaction();
        try{
            currentSession.save(faculty);
            transaction.commit();
            status=0; //0 means successful
        }catch (ConstraintViolationException e){
            status = 2; //0 means constraint violation
            System.out.println("---------------VIOLATIONNNNNNNNNNNN-----------------");
        }
        return status;
    }
}
