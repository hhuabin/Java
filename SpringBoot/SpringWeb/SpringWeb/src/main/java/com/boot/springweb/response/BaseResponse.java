package com.boot.springweb.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bin
 * @date 2023-06-08-15:47
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseResponse {

    public static final String RESULT_SUCCESS = "0";

    private String result_code;

    private String version;

    private String timestamp;

    private String charset;

    private String req_source;

    private String token;

    private String system;

    private String requestSerial;

    private String err_msg = "";

    public void success() {
        this.setResult_code(BaseResponse.RESULT_SUCCESS);
        this.setErr_msg("");
    }

    public void error() {
        this.setResult_code("-1");
        this.setErr_msg("系统内部错误");
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "result_code='" + result_code + '\'' +
                ", version='" + version + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", charset='" + charset + '\'' +
                ", req_source='" + req_source + '\'' +
                ", token='" + token + '\'' +
                ", system='" + system + '\'' +
                ", requestSerial='" + requestSerial + '\'' +
                ", err_msg='" + err_msg + '\'' +
                '}';
    }
}
