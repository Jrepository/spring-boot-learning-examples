package indi.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyController {

    @GetMapping("/index")
    public void index(HttpSession session){
        System.out.println("index");
    }
    @GetMapping("/login")
    public void logiin(HttpSession session){
        session.setAttribute("loginName","loginName");
        System.out.println("login");
    }
    @GetMapping("/add")
    public void add(HttpSession session){
        System.out.println("add");
    }
}
