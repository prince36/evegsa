package com.portal.evegsa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String allFlats(Map<String, Object> map) {

        return "dashboard";
    }
}
