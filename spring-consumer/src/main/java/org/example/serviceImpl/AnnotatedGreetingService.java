package org.example.serviceImpl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.api.dto.GoodDto;
import org.example.api.service.GoodService;
import org.springframework.stereotype.Service;

/**
 * @author likesheng
 * @version 1.0
 * @Description TODO
 * @date 2022/3/28 18:35
 */

@Service
public class AnnotatedGreetingService {


    @DubboReference(version = "1.0.0", group = "test")
    private GoodService greetingService;

    public GoodDto sayHello(String name) {
        return greetingService.findGoodByUsername(name);
    }
}
