package com.ahmedrafayat.dao;

import com.ahmedrafayat.model.Course;
import com.ahmedrafayat.model.Routine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;

public class routineDaoImpl implements routineDao{

    private SessionFactory sessionFactory;

    @Override
    public int editRoutine(Routine routine) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class).addAnnotatedClass(com.ahmedrafayat.model.Course.class);
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        List<Routine> routine1 = session.createSQLQuery("SELECT * FROM routine where class_day='"+routine.getDay()+"' and slot_number='"+routine.getSltnmb()+"' and department_name='"+routine.getDepartmentname()+"' and semester='"+routine.getSemester()+"' ").addEntity(Routine.class).list();
        if(routine1.size()>0){
            Routine temp = routine1.get(0);
            routine.setId(temp.getId());
            System.out.println(routine.toString());
            session.clear();
            session.evict(routine);
            session.saveOrUpdate(routine);
            tx.commit();
            return 1;
        }
        else{
            session.save(routine);
            tx.commit();
            return 1;
        }

    }

    @Override
    public int addRoutine(Routine routine) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class).addAnnotatedClass(com.ahmedrafayat.model.Course.class);
        sessionFactory = configuration.buildSessionFactory();
        int status=1; //1 is default value

        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        try{
            currentSession.save(routine);
            transaction.commit();
            status=0; //0 means successful
        }catch (ConstraintViolationException e){
            status = 2; //0 means constraint violation
            System.out.println("---------------VIOLATIONNNNNNNNNNNN-----------------");
        }
        return status;
    }

    @Override
    public List<Routine> getRoutineList(int sem, String dept_name) {
        return null;
    }
}
