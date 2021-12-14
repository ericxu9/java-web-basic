package org.xumiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(String name) {
        System.out.println(name);
        return "测试";
    }

}
