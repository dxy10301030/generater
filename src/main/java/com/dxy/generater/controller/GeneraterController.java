package com.dxy.generater.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneraterController {
    @RequestMapping()
    @ResponseBody
    public String test(){
        return "111";
    }
}
