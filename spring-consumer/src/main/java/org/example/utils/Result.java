package org.example.utils;

import lombok.Data;

/**
 * @author likesheng
 * @version 1.0
 * @Description 返回的数据信息
 * @date 2022/3/28 18:07
 */
@Data
public class Result {

    private Object data;

    private int code;

    public static Result success(Object object) {
        Result result = new Result();
        result.data = object;
        result.code = 1;
        return result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
