package com.ahmedrafayat.controller;

import com.ahmedrafayat.dao.routineDao;
import com.ahmedrafayat.dao.routineDaoImpl;
import com.ahmedrafayat.model.Course;
import com.ahmedrafayat.model.Faculty;
import com.ahmedrafayat.model.Routine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.*;
import javax.validation.constraints.Null;

import java.util.ArrayList;
import java.util.List;

@Controller
public class routineController {
    private static SessionFactory sessionFactory;

    @RequestMapping(method = RequestMethod.POST, value = "/apply")
    public ModelAndView loadRoutineData(HttpServletRequest request, HttpServletResponse response) {
        try{
            String dept = request.getParameter("department");
            String sem = request.getParameter("semester");
            ModelAndView mv = new ModelAndView();
            Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Course.class).addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class);
            sessionFactory = configuration.buildSessionFactory();
            Session currentSession = sessionFactory.openSession();
            String day = (String) request.getParameter("day");
            String slot = (String) request.getParameter("slot_number");
            System.out.println("==================="+day+"===================");
            if (day!=null && slot!=null) {
                List<Course> courseList = currentSession.createSQLQuery("SELECT * from course where semester='" + sem + "' and department_name='" + dept + "'").addEntity(Course.class).list();
                List<Integer> courseid_list = new ArrayList<>();
                for (int i = 0; i < courseList.size(); i++) {
                    System.out.println(courseList.get(i).toString());
                    courseid_list.add(courseList.get(i).getId());
                }

                List<Faculty> facultyList = currentSession.createSQLQuery("SELECT * from faculty where department_name='" + dept + "'").addEntity(Faculty.class).list();
                currentSession.close();
                mv.addObject("day",day);
                mv.addObject("slot_number",slot);
                mv.addObject("department", dept);
                mv.addObject("semester", sem);
                mv.addObject("courseid_list", courseid_list);
                mv.addObject("faculty_name", facultyList);
                mv.setViewName("editRoutine");
            }
            else{
                List<Course> courseList = currentSession.createSQLQuery("SELECT * from course where semester='" + sem + "' and department_name='" + dept + "'").addEntity(Course.class).list();
                List<Integer> courseid_list = new ArrayList<>();
                for (int i = 0; i < courseList.size(); i++) {
                    System.out.println(courseList.get(i).toString());
                    courseid_list.add(courseList.get(i).getId());
                }

                List<Faculty> facultyList = currentSession.createSQLQuery("SELECT * from faculty where department_name='" + dept + "'").addEntity(Faculty.class).list();
                currentSession.close();
                mv.addObject("department", dept);
                mv.addObject("semester", sem);
                mv.addObject("courseid_list", courseid_list);
                mv.addObject("faculty_name", facultyList);
                mv.setViewName("addRoutine");
            }
            return mv;
        }catch (NullPointerException e){

        }
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Course.class).addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();



        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, value="/showRoutine")
    public ModelAndView showRoutine(HttpServletRequest request){
        String dept = request.getParameter("department");
        String sem = request.getParameter("semester");
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Course.class).addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        List<Routine> rlist = currentSession.createSQLQuery("SELECT * from routine where semester='" + sem + "' and department_name='" + dept + "'").addEntity(Routine.class).list();

        int size = rlist.size();
        List<String> monList = new ArrayList<String>(7);
        monList.add(0, null);
        monList.add(1, "");
        monList.add(2, "");
        monList.add(3, "");
        monList.add(4, "");
        monList.add(5, "");
        monList.add(6, "");
        List<String> monList1 = new ArrayList<String>(7);
        monList1.add(0, null);
        monList1.add(1, "");
        monList1.add(2, "");
        monList1.add(3, "");
        monList1.add(4, "");
        monList1.add(5, "");
        monList1.add(6, "");
        List<String> monList2 = new ArrayList<String>(7);
        monList2.add(0, null);
        monList2.add(1, "");
        monList2.add(2, "");
        monList2.add(3, "");
        monList2.add(4, "");
        monList2.add(5, "");
        monList2.add(6, "");

        List<String> tueList = new ArrayList<String>(7);
        tueList.add(0, null);
        tueList.add(1, "");
        tueList.add(2, "");
        tueList.add(3, "");
        tueList.add(4, "");
        tueList.add(5, "");
        tueList.add(6, "");
        List<String> tueList1 = new ArrayList<String>(7);
        tueList1.add(0, "");
        tueList1.add(1, "");
        tueList1.add(2, "");
        tueList1.add(3, "");
        tueList1.add(4, "");
        tueList1.add(5, "");
        tueList1.add(6, "");
        List<String> tueList2 = new ArrayList<String>(7);
        tueList2.add(0, "");
        tueList2.add(1, "");
        tueList2.add(2, "");
        tueList2.add(3, "");
        tueList2.add(4, "");
        tueList2.add(5, "");
        tueList2.add(6, "");

        List<String> wedList = new ArrayList<String>(7);
        wedList.add(0, null);
        wedList.add(1, "");
        wedList.add(2, "");
        wedList.add(3, "");
        wedList.add(4, "");
        wedList.add(5, "");
        wedList.add(6, "");
        List<String> wedList1 = new ArrayList<String>(7);
        wedList1.add(0, null);
        wedList1.add(1, "");
        wedList1.add(2, "");
        wedList1.add(3, "");
        wedList1.add(4, "");
        wedList1.add(5, "");
        wedList1.add(6, "");
        List<String> wedList2 = new ArrayList<String>(7);
        wedList2.add(0, null);
        wedList2.add(1, "");
        wedList2.add(2, "");
        wedList2.add(3, "");
        wedList2.add(4, "");
        wedList2.add(5, "");
        wedList2.add(6, "");

        List<String> thuList = new ArrayList<String>(7);
        thuList.add(0, null);
        thuList.add(1, "");
        thuList.add(2, "");
        thuList.add(3, "");
        thuList.add(4, "");
        thuList.add(5, "");
        thuList.add(6, "");
        List<String> thuList1 = new ArrayList<String>(7);
        thuList1.add(0, null);
        thuList1.add(1, "");
        thuList1.add(2, "");
        thuList1.add(3, "");
        thuList1.add(4, "");
        thuList1.add(5, "");
        thuList1.add(6, "");
        List<String> thuList2 = new ArrayList<String>(7);
        thuList2.add(0, null);
        thuList2.add(1, "");
        thuList2.add(2, "");
        thuList2.add(3, "");
        thuList2.add(4, "");
        thuList2.add(5, "");
        thuList2.add(6, "");

        List<String> friList = new ArrayList<String>(7);
        friList.add(0, null);
        friList.add(1, "");
        friList.add(2, "");
        friList.add(3, "");
        friList.add(4, "");
        friList.add(5, "");
        friList.add(6, "");
        List<String> friList1 = new ArrayList<String>(7);
        friList1.add(0, null);
        friList1.add(1, "");
        friList1.add(2, "");
        friList1.add(3, "");
        friList1.add(4, "");
        friList1.add(5, "");
        friList1.add(6, "");
        List<String> friList2 = new ArrayList<String>(7);
        friList2.add(0, null);
        friList2.add(1, "");
        friList2.add(2, "");
        friList2.add(3, "");
        friList2.add(4, "");
        friList2.add(5, "");
        friList2.add(6, "");

        for (int i = 0; i < size; i++) {
            System.out.println("------in VIEWROUTINE.JSP--------------");
            String routineDay = rlist.get(i).getDay();
            if (routineDay.equalsIgnoreCase("Monday") && rlist.get(i) != null) {
                monList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                monList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                monList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Tuesday")) {
                tueList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                tueList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                tueList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Wednesday")) {
                wedList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                wedList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                wedList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Thursday")) {
                thuList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                thuList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                thuList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Friday")) {
                friList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                friList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                friList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
                System.out.println("------oFriday----"+rlist.get(i).getSltnmb()+"----------");
            }
            System.out.println("------out of VIEWROUTINE.JSP--------------");
        }

        mv.addObject("department", dept);
        mv.addObject("semester", sem);
        mv.addObject("routine_list", rlist);
        mv.addObject("monList", monList);
        mv.addObject("monList1", monList1);
        mv.addObject("monList2", monList2);
        mv.addObject("tueList", tueList);
        mv.addObject("tueList1", tueList1);
        mv.addObject("tueList2", tueList2);
        mv.addObject("wedList", wedList);
        mv.addObject("wedList1", wedList1);
        mv.addObject("wedList2", wedList2);
        mv.addObject("thuList", thuList);
        mv.addObject("thuList1", thuList1);
        mv.addObject("thuList2", thuList2);
        mv.addObject("friList", friList);
        mv.addObject("friList1", friList1);
        mv.addObject("friList2", friList2);
        mv.setViewName("viewRoutine");

        return mv;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/addRoutine")
    public ModelAndView addRoutineData(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("-------------------" + request.getParameter("slot") + "------------------------------");

        String dept = request.getParameter("department");
        String sem = request.getParameter("semester");
        System.out.println("-------department is "+dept+"---------------");
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Course.class).addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();

        Routine routine = new Routine();
        routine.setDay(request.getParameter("day"));
        routine.setCourseid(request.getParameter("course"));
        routine.setDepartmentname(request.getParameter("department"));
        routine.setFacultyname(request.getParameter("faculty"));
        routine.setRoomname(request.getParameter("room"));
        routine.setSemester(request.getParameter("semester"));
        routine.setSltnmb(Integer.parseInt(request.getParameter("slot")));
        System.out.println("---------INSERTION DONE------------");
        routineDao routineDao = new routineDaoImpl();
        int status = routineDao.addRoutine(routine);
        System.out.println("---------ADDITION DONE  "+status+"------------");

        List<Course> courseList = currentSession.createSQLQuery("SELECT * from course where semester='" + sem + "' and department_name='" + dept + "'").addEntity(Course.class).list();
        List<Integer> courseid_list = new ArrayList<>();
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i).toString());
            courseid_list.add(courseList.get(i).getId());
        }
        List<Faculty> facultyList = currentSession.createSQLQuery("SELECT * from faculty where department_name='" + dept + "'").addEntity(Faculty.class).list();

        ModelAndView mv = new ModelAndView();
        mv.addObject("department", request.getParameter("department"));
        mv.addObject("semester", request.getParameter("semester"));
        mv.addObject("courseid_list", courseid_list);
        mv.addObject("faculty_name", facultyList);
        if(status==2){
            mv.addObject("added", "violation");
        }
        else if(status == 0){
            mv.addObject("added", "okay");
        }
        mv.setViewName("addRoutine");
        
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/editRoutineDeptSelect")
    public ModelAndView editRoutineloader(HttpServletRequest request, HttpServletResponse response) {
        String day = request.getParameter("day");
        String slot = request.getParameter("slot_number");

        ModelAndView mv = new ModelAndView();
        mv.addObject("day",day);
        mv.addObject("slot_number",slot);
        mv.setViewName("routineselector");
        System.out.println("-----------");
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/editRoutine")
    public ModelAndView editRoutine(HttpServletRequest request){
        Routine routine = new Routine();
        routine.setDay(request.getParameter("day"));
        routine.setCourseid(request.getParameter("course"));
        routine.setDepartmentname(request.getParameter("department"));
        routine.setFacultyname(request.getParameter("faculty"));
        routine.setRoomname(request.getParameter("room"));
        routine.setSemester(request.getParameter("semester"));
        routine.setSltnmb(Integer.parseInt(request.getParameter("slot_number")));
        System.out.println("---------INSERTION DONE------------"+routine.toString()+"");
        routineDao routineDao = new routineDaoImpl();
        int status = routineDao.editRoutine(routine);
        System.out.println("---------ADDITION DONE  "+status+"------------");


        String dept = request.getParameter("department");
        String sem = request.getParameter("semester");
        ModelAndView mv = new ModelAndView();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(com.ahmedrafayat.model.Course.class).addAnnotatedClass(com.ahmedrafayat.model.Faculty.class).addAnnotatedClass(com.ahmedrafayat.model.Routine.class);
        sessionFactory = configuration.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        List<Routine> rlist = currentSession.createSQLQuery("SELECT * from routine where semester='" + sem + "' and department_name='" + dept + "'").addEntity(Routine.class).list();

        int size = rlist.size();
        List<String> monList = new ArrayList<String>(7);
        monList.add(0, null);
        monList.add(1, "");
        monList.add(2, "");
        monList.add(3, "");
        monList.add(4, "");
        monList.add(5, "");
        monList.add(6, "");
        List<String> monList1 = new ArrayList<String>(7);
        monList1.add(0, null);
        monList1.add(1, "");
        monList1.add(2, "");
        monList1.add(3, "");
        monList1.add(4, "");
        monList1.add(5, "");
        monList1.add(6, "");
        List<String> monList2 = new ArrayList<String>(7);
        monList2.add(0, null);
        monList2.add(1, "");
        monList2.add(2, "");
        monList2.add(3, "");
        monList2.add(4, "");
        monList2.add(5, "");
        monList2.add(6, "");

        List<String> tueList = new ArrayList<String>(7);
        tueList.add(0, null);
        tueList.add(1, "");
        tueList.add(2, "");
        tueList.add(3, "");
        tueList.add(4, "");
        tueList.add(5, "");
        tueList.add(6, "");
        List<String> tueList1 = new ArrayList<String>(7);
        tueList1.add(0, "");
        tueList1.add(1, "");
        tueList1.add(2, "");
        tueList1.add(3, "");
        tueList1.add(4, "");
        tueList1.add(5, "");
        tueList1.add(6, "");
        List<String> tueList2 = new ArrayList<String>(7);
        tueList2.add(0, "");
        tueList2.add(1, "");
        tueList2.add(2, "");
        tueList2.add(3, "");
        tueList2.add(4, "");
        tueList2.add(5, "");
        tueList2.add(6, "");

        List<String> wedList = new ArrayList<String>(7);
        wedList.add(0, null);
        wedList.add(1, "");
        wedList.add(2, "");
        wedList.add(3, "");
        wedList.add(4, "");
        wedList.add(5, "");
        wedList.add(6, "");
        List<String> wedList1 = new ArrayList<String>(7);
        wedList1.add(0, null);
        wedList1.add(1, "");
        wedList1.add(2, "");
        wedList1.add(3, "");
        wedList1.add(4, "");
        wedList1.add(5, "");
        wedList1.add(6, "");
        List<String> wedList2 = new ArrayList<String>(7);
        wedList2.add(0, null);
        wedList2.add(1, "");
        wedList2.add(2, "");
        wedList2.add(3, "");
        wedList2.add(4, "");
        wedList2.add(5, "");
        wedList2.add(6, "");

        List<String> thuList = new ArrayList<String>(7);
        thuList.add(0, null);
        thuList.add(1, "");
        thuList.add(2, "");
        thuList.add(3, "");
        thuList.add(4, "");
        thuList.add(5, "");
        thuList.add(6, "");
        List<String> thuList1 = new ArrayList<String>(7);
        thuList1.add(0, "");
        thuList1.add(1, "");
        thuList1.add(2, "");
        thuList1.add(3, "");
        thuList1.add(4, "");
        thuList1.add(5, "");
        thuList1.add(6, "");
        List<String> thuList2 = new ArrayList<String>(7);
        thuList2.add(0, "");
        thuList2.add(1, "");
        thuList2.add(2, "");
        thuList2.add(3, "");
        thuList2.add(4, "");
        thuList2.add(5, "");
        thuList2.add(6, "");

        List<String> friList = new ArrayList<String>(7);
        friList.add(0, null);
        friList.add(1, "");
        friList.add(2, "");
        friList.add(3, "");
        friList.add(4, "");
        friList.add(5, "");
        friList.add(6, "");
        List<String> friList1 = new ArrayList<String>(7);
        friList1.add(0, "");
        friList1.add(1, "");
        friList1.add(2, "");
        friList1.add(3, "");
        friList1.add(4, "");
        friList1.add(5, "");
        friList1.add(6, "");
        List<String> friList2 = new ArrayList<String>(7);
        friList2.add(0, "");
        friList2.add(1, "");
        friList2.add(2, "");
        friList2.add(3, "");
        friList2.add(4, "");
        friList2.add(5, "");
        friList2.add(6, "");

        for (int i = 0; i < size; i++) {
            System.out.println("------in VIEWROUTINE.JSP--------------");
            String routineDay = rlist.get(i).getDay();
            if (routineDay.equalsIgnoreCase("Monday") && rlist.get(i) != null) {
                monList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                monList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                monList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Tuesday")) {
                tueList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                tueList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                tueList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Wednesday")) {
                wedList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                wedList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                wedList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Thursday")) {
                thuList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                thuList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                thuList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            } else if (routineDay.equalsIgnoreCase("Friday")) {
                friList.add(rlist.get(i).getSltnmb(), rlist.get(i).getCourseid());
                friList1.add(rlist.get(i).getSltnmb(), rlist.get(i).getFacultyname());
                friList2.add(rlist.get(i).getSltnmb(), rlist.get(i).getRoomname());
            }
            System.out.println("------out of VIEWROUTINE.JSP--------------");
        }

        mv.addObject("department", dept);
        mv.addObject("semester", sem);
        mv.addObject("routine_list", rlist);
        mv.addObject("monList", monList);
        mv.addObject("monList1", monList1);
        mv.addObject("monList2", monList2);
        mv.addObject("tueList", tueList);
        mv.addObject("tueList1", tueList1);
        mv.addObject("tueList2", tueList2);
        mv.addObject("wedList", wedList);
        mv.addObject("wedList1", wedList1);
        mv.addObject("wedList2", wedList2);
        mv.addObject("thuList", thuList);
        mv.addObject("thuList1", thuList1);
        mv.addObject("thuList2", thuList2);
        mv.addObject("friList", friList);
        mv.addObject("friList1", friList1);
        mv.addObject("friList2", friList2);
        mv.setViewName("viewRoutine");

        return mv;
    }

}
