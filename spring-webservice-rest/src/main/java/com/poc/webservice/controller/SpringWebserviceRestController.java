package com.poc.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by achernysh on 22.10.2015.
 */
@Controller
@RequestMapping("/SpringWebserviceRest")
public class SpringWebserviceRestController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public @ResponseBody
    String helloWorld() {
        return "Hello, Worlds";
    }
}
