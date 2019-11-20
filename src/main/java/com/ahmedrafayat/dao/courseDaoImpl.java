package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class courseDaoImpl implements courseDao{

    private static SessionFactory sessionFactory;

    @Override
    public List<Course> getCourseList() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Course.class);
        sessionFactory = configuration.buildSessionFactory();
        System.out.println("-------------------IN DAO IMPLEMENTA-----------------------");

        Session currentSession = sessionFactory.openSession();
        List<Course> courseList = currentSession.createSQLQuery("SELECT * FROM course").addEntity(Course.class).list();
        for(Course course : courseList){
            System.out.println(course.toString());
        }
        return courseList;
    }

    @Override
    public List<Course> getCoursewithParams(String department) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Course.class);
        sessionFactory = configuration.buildSessionFactory();
        System.out.println("-------------------IN DAO IMPLEMENTA-----------------------");

        Session currentSession = sessionFactory.openSession();
        List<Course> courseList = currentSession.createSQLQuery("SELECT * FROM course where department_name='"+department+"'").addEntity(Course.class).list();
        for(Course course : courseList){
            System.out.println(course.toString());
        }
        return courseList;
    }
}
