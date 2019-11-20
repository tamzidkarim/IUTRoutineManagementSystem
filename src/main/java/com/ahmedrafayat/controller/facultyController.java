package com.ahmedrafayat.controller;


import com.ahmedrafayat.dao.facultyDao;
import com.ahmedrafayat.dao.facultyDaoImpl;
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
public class facultyController {

    private static SessionFactory sessionFactory;

    @RequestMapping(method= RequestMethod.POST,value = "/addfaculty")
    public ModelAndView addFaculty(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();

        Faculty faculty = new Faculty();
        faculty.setName(request.getParameter("facultyname"));
        faculty.setDeptname(request.getParameter("department"));
        faculty.setDesignation(request.getParameter("designation").toString().trim());
        System.out.println("---------------------designation is "+request.getParameter("designation").toString().trim()+"----------------------");
        faculty.setPriority(Integer.parseInt(request.getParameter("priority")));
        facultyDao fDao = new facultyDaoImpl();
        int status = fDao.addFaculty(faculty);
        if(status==2){
            mv.addObject("added", "violation");
        }
        else if(status == 0){
            mv.addObject("added", "okay");
        }
        mv.setViewName("addFaculty");

        return mv;
    }

    @RequestMapping(method= RequestMethod.POST,value = "/viewfacultywithparams")
    public ModelAndView viewFaculty(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Faculty.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        String department = request.getParameter("department");
        facultyDao faculty = new facultyDaoImpl();
        List<Faculty> flist = faculty.getFacultywithParams(department);

        mv.addObject("facultyList",flist);
        mv.setViewName("facultyPage");
        return mv;
    }


}
