package com.ideaout.dategirls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    @RequestMapping("/1")
    private String index(){
        return "ok";
    }
}
