package com.restApi.RestAPI.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {



    @RequestMapping("say-hello-jsp")
    public String sayHello() {
        return "sayHello";
    }
}
