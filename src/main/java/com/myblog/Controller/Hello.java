package com.myblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lucifer on 2018/6/12.
 */
@Controller
public class Hello {
    @RequestMapping("/admin")
    public String hello(){
        return "Hello";
    }
}
