package com.sn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","余一");
        return "hello";
    }

}
