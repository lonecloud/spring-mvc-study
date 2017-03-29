package cn.lonecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lonecloud on 17/3/12.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello/")
    public String Hello(){
        return "hello";
    }
    @RequestMapping("/hello/{str}")
    public String variable(@PathVariable("str") String str){
        System.out.println(str);
        return "hello";
    }
}
