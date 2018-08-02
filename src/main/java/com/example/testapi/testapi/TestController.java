package com.example.testapi.testapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String loadSay() {

        System.out.println("hello world");
        return "hello world";
    }
}
