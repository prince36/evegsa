package com.portal.evegsa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String dashboard(Map<String, Object> map) {

        return "dashboard";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String homePage(Map<String, Object> map) {

        return "home";
    }
}
