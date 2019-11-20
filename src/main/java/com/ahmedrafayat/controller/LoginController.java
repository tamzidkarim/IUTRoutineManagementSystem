package com.ahmedrafayat.controller;

import com.ahmedrafayat.dao.userDao;
import com.ahmedrafayat.dao.userDaoImpl;
import com.ahmedrafayat.service.userService;
import com.ahmedrafayat.service.userServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;


@Controller
public class LoginController {

    @RequestMapping(method=RequestMethod.POST, value = "/add")
    public ModelAndView validateParams(HttpServletRequest request, HttpServletResponse response){
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        System.out.println("----"+user+"---"+pass+"-----");
        ModelAndView mv = new ModelAndView();
        userServiceImpl service = new userServiceImpl();
        if(service.validateStudentCredential(user,pass)){
            mv.setViewName("homePage");
        }
        else{
            mv.addObject("error",true);
            mv.setViewName("login");
        }
        return mv;
    }
}
