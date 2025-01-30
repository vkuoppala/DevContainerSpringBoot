package com.seamk.DevContainerSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, World!";
    }
}
