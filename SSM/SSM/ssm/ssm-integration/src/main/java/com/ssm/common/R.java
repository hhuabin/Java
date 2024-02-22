package com.ssm.common;

/**
 * @author bin
 * @date 2024-02-22 14:44
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class R<T> {

    private Integer result_code; //编码：1成功，0和其它数字为失败

    private String err_msg; //错误信息

    private T data; //数据

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.result_code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.err_msg = msg;
        r.result_code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        return this;
    }

}

