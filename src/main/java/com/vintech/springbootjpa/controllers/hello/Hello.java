package com.vintech.springbootjpa.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi Vinayak + good job, well done, Pat on Back - first server response";
    }

}
