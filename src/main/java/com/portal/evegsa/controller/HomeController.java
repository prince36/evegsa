package com.portal.evegsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    //One FLat
    @RequestMapping(value = "/1,{idevent}", method = RequestMethod.GET)
    public String allFlatsOne(@PathVariable("idevent") Long idevent, Map<String, Object> map) {


        //map.put("eve", Repository.findAllCity());
        return "eventP";
    }
}