package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.serviceImpl.AnnotatedGreetingService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/4/1 22:33
 */
@RestController("/")
@Slf4j
public class DubboController {


    private final AnnotatedGreetingService annotatedGreetingService;


    @Autowired
    public DubboController(AnnotatedGreetingService annotatedGreetingService) {
        this.annotatedGreetingService = annotatedGreetingService;
    }


    @GetMapping("hello")
    @ResponseBody
    public Result getHello(String name){
        log.info("調用成功");
        return Result.success(annotatedGreetingService.sayHello(name));
    }
}
