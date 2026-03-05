package org.example.springboothello.vo;

import lombok.Data;
import java.io.Serializable;

/**
 * 统一返回结果封装类
 */
@Data
public class ResultVO<T> implements Serializable {
    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T data;

    /**
     * 成功响应（带数据）
     */
    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> result = new ResultVO<>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    /**
     * 成功响应（无数据）
     */
    public static <T> ResultVO<T> success() {
        return success(null);
    }

    /**
     * 失败响应
     */
    public static <T> ResultVO<T> fail(int code, String msg) {
        ResultVO<T> result = new ResultVO<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}