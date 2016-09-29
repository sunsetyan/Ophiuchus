package com.ophiuchus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // The Environment object will be used to read parameters from the
    // application.properties configuration file
    @Autowired
    private Environment env;

    /**
     * Show the index page containing the form for uploading a file.
     */
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

} // class MainController
