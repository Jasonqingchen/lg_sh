package com.example.LqcSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author：liuqingchen
 * @since：2022/10/28
 */
@Controller
public class LoginController {

    /**
     * 跳转页面
     */
    @RequestMapping("/lg")
    public String login () {
        return "login";
    }
}
