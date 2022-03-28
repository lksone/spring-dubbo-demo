package org.example.api.dto;

import java.io.Serializable;

/**
 * @author likesheng
 * @version 1.0
 * @Description 商品信息
 * @date 2022/3/28 16:53
 */
public class GoodDto implements Serializable {

    /**
     * 用户信息
     */
    private String username;

    /**
     *  真實姓名
     */
    private String realname;

    /**
     * 年龄
     */
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoodDto() {
    }
}
