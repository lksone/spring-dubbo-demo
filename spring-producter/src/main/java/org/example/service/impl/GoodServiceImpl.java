package org.example.service.impl;

import org.example.api.dto.GoodDto;
import org.example.api.service.GoodService;
import org.springframework.stereotype.Service;

/**
 * @author likesheng
 * @version 1.0
 * @Description 数据添加
 * @date 2022/3/28 17:11
 */
@Service
public class GoodServiceImpl implements GoodService {

    @Override
    public GoodDto findGoodByUsername(String goodName) {
        GoodDto goodDto = new GoodDto();
        goodDto.setUsername("likesheng");
        goodDto.setRealname(goodName);
        goodDto.setAge(31);
        return goodDto;
    }
}
