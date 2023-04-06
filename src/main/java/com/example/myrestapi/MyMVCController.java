package com.example.myrestapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMVCController {
    @GetMapping("/mvc")
    public String getMVC(){
        System.out.println("MyMVCController - getMVC()");
        return "hi-mvc"; // view의 이름
    }
}
