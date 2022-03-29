package org.example.controller;

import org.example.serviceImpl.AnnotatedGreetingService;
import org.example.utils.Result;
import org.springframework.context.ApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author likesheng
 * @version 1.0
 * @Description 消费者数据信息
 * @date 2022/3/28 18:05
 */
@Path("/")
public class RestApiService {

    public static ApplicationContext applicationContext;

    @Path("/checkAlive")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Result alive() {
        return Result.success("OK");
    }

    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON) // 声明这个接口将以json格式返回
    public Result hello(@QueryParam("name") String name) {
        return Result.success(applicationContext.getBean(AnnotatedGreetingService.class).sayHello(name));
    }
}
