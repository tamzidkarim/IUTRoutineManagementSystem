package com.ahmedrafayat.controller;

import com.ahmedrafayat.dao.courseDao;
import com.ahmedrafayat.dao.courseDaoImpl;
import com.ahmedrafayat.dao.facultyDao;
import com.ahmedrafayat.dao.facultyDaoImpl;
import com.ahmedrafayat.model.Course;
import com.ahmedrafayat.model.Faculty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {


    @RequestMapping(method= RequestMethod.GET,value = "/viewfacultydropdown")
    public ModelAndView viewFaculties(){
        facultyDao faculty = new facultyDaoImpl();
        List<Faculty> flist = faculty.getFacultyList();

        ModelAndView mv = new ModelAndView();
        mv.addObject("facultyList",flist);
        mv.setViewName("facultyPage");
        return mv;
    }

    @RequestMapping(method= RequestMethod.GET,value = "/addfacultydropdown")
    public ModelAndView addFaculties(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addFaculty");
        return mv;
    }

    @RequestMapping(method= RequestMethod.GET,value = "/home")
    public ModelAndView loadHome(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("homePage");
        return mv;
    }

    @RequestMapping(method= RequestMethod.GET, value = "/viewroutinedropdown")
    public ModelAndView loadviewRoutine() {
        ModelAndView mv = new ModelAndView();
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
        wedList1.add(0, "");
        wedList1.add(1, "");
        wedList1.add(2, "");
        wedList1.add(3, "");
        wedList1.add(4, "");
        wedList1.add(5, "");
        wedList1.add(6, "");
        List<String> wedList2 = new ArrayList<String>(7);
        wedList2.add(0, "");
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
    @RequestMapping(method= RequestMethod.GET, value = "/addroutinedropdown")
    public ModelAndView loadaddRoutine() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("routineselector");
        return mv;
    }

}
