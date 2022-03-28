package org.example.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.api.dto.GoodDto;
import org.example.api.service.GoodService;

/**
 * @author likesheng
 * @version 1.0
 * @Description 数据添加
 * @date 2022/3/28 17:11
 */
@DubboService(version = "1.0.0", group = "test")
public class GoodServiceImpl implements GoodService {

    @Override
    public GoodDto findGoodByUsername(String goodName) {
        GoodDto goodDto = new GoodDto();
        goodDto.setUsername("likesheng");
        goodDto.setAge(31);
        return goodDto;
    }
}
