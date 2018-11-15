package com.test.stringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/***
 *@author sq
 *@date2018/11/1510:41
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}
