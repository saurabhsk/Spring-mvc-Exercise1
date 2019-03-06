package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcomeUser() {

        User user = new User();
        user.setUname("Saurabh");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("uname", user);
        return modelAndView;
    }
}
