package com.edufelizardo.mundi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author edufelizardo
 * @version 1.0.0
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("nome", "Mundo");
        return "hello";
    }
}
