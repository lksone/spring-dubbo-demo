package org.example.api.service;

import org.example.api.dto.GoodDto;

/**
 * @author likesheng
 * @version 1.0
 * @Description
 * @date 2022/3/28 16:53
 */
public interface GoodService {


    /**
     * 用户信息
     * @param goodName
     * @return
     */
    GoodDto findGoodByUsername(String goodName);
}
