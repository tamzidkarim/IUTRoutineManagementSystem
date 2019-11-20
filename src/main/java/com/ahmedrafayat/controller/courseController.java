package com.ahmedrafayat.controller;

import com.ahmedrafayat.dao.courseDao;
import com.ahmedrafayat.dao.courseDaoImpl;
import com.ahmedrafayat.dao.facultyDao;
import com.ahmedrafayat.dao.facultyDaoImpl;
import com.ahmedrafayat.model.Course;
import com.ahmedrafayat.model.Faculty;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class courseController {

    private static SessionFactory sessionFactory;

    @RequestMapping(method= RequestMethod.GET,value = "/viewcoursedropdown")
    public ModelAndView viewCourse(){
        courseDao faculty = new courseDaoImpl();
        List<Course> clist = faculty.getCourseList();

        ModelAndView mv = new ModelAndView();
        mv.addObject("courseList",clist);
        mv.setViewName("coursePage");
        return mv;
    }

    @RequestMapping(method= RequestMethod.POST,value = "/viewcoursewithparams")
    public ModelAndView viewFaculty(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        String department = request.getParameter("department");
        courseDao course = new courseDaoImpl();
        List<Course> clist = course.getCoursewithParams(department);

        mv.addObject("courseList",clist);
        mv.setViewName("coursePage");
        return mv;
    }
}
