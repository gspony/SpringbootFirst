package com.lut.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Date 2020-09-27
 * @Author MaWeiJun
 * @Version 1.0
 */
@Controller
public class helloControl {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return("hello Springboot");
    }
}
