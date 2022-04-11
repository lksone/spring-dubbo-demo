package org.example.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.api.dto.GoodDto;
import org.example.api.service.GoodService;
import org.springframework.stereotype.Service;

/**
 * @author likesheng
 * @version 1.0
 * @Description 当前数据信息添加到
 * @date 2022/3/28 18:35
 */

@Service
public class AnnotatedGreetingService {


    @Reference
    private GoodService greetingService;

    public GoodDto sayHello(String name) {
        return greetingService.findGoodByUsername(name);
    }
}
