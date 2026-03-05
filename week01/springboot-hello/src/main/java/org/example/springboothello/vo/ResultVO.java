package org.example.springboothello.vo;

import lombok.Data;

/**
 * 统一返回结果包装类
 * 泛型 T 支持不同类型的 data 字段
 */
@Data
public class ResultVO<T> {
    // 状态码，固定200表示成功
    private Integer code;
    // 提示信息，固定success表示成功
    private String msg;
    // 业务数据，这里是欢迎语字符串
    private T data;

    /**
     * 成功返回的静态方法（简化调用）
     */
    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> result = new ResultVO<>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
}